package proyectoLen.src.ui;

import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import proyectoLen.src.antlr.PicalculusLexer;
import proyectoLen.src.antlr.PicalculusParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
	public static void main(String[] args) throws IOException {
		CharStream input = CharStreams.fromFileName("programa.txt");
		PicalculusLexer lexer = new PicalculusLexer(input);
		CommonTokenStream common = new CommonTokenStream(lexer);
		PicalculusParser parser = new PicalculusParser(common);
		// parser.compileParseTreePattern(arg0, arg1);
		// ParseTree tree = parser.translationunit();
		System.out.println("Done");
	}
}
