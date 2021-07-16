package proyectoLen.src.ui;

import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.gui.Trees;

import proyectoLen.src.antlr.PicalculusLexer;
import proyectoLen.src.antlr.PicalculusParser;

import org.antlr.v4.gui.TestRig;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
	public static void main(String[] args) throws IOException {
		CharStream input = CharStreams.fromFileName("proyectoLen/ejemplos/programa.txt");
		PicalculusLexer lexer = new PicalculusLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		PicalculusParser parser = new PicalculusParser(tokens);
		// parser.compileParseTreePattern(arg0, arg1);
		// ParseTree tree = parser.translationunit();

      tokens.fill();
      parser.setBuildParseTree(true);
      try {
         System.out.println("legoo");
         ParserRuleContext tree = (ParserRuleContext)parser.prog();
         Trees.inspect(tree, parser);
      }
      catch (RuntimeException e) {
         System.err.println("No method for rule "+"prog"+" or it has arguments" +e);
      }
		System.out.println("Done");
	}
}
