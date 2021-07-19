package proyectoLen.src.ui;

import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.gui.Trees;

import proyectoLen.src.antlr.PicalculusLexer;
import proyectoLen.src.antlr.PicalculusParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		CharStream input = CharStreams.fromFileName("proyectoLen/ejemplos/programa.txt");
		PicalculusLexer lexer = new PicalculusLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PicalculusParser parser = new PicalculusParser(tokens);
		
		tokens.fill();
		parser.setBuildParseTree(true);
		try {
			ParserRuleContext tree = parser.prog();
			// ParseTreeWalker.DEFAULT.walk(arg0, tree); Creo que esto tambien puede ser util
			Thread.sleep(1000);
			if(!PicalculusParser.SEMANTIC_ERROR)
				Trees.inspect(tree, parser);
		} catch (RuntimeException e) {
			/*Handlle error unecesary*/ 
		}
	}
}
