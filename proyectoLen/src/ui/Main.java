package proyectoLen.src.ui;

import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.gui.Trees;

import proyectoLen.src.antlr.PicalculusLexer;
import proyectoLen.src.antlr.PicalculusParser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

public class Main {
   
   public static void main(String[] args) throws IOException, InterruptedException {
      String url = "proyectoLen/ejemplos/programa1.txt";
      System.out.printf("######    ####      ####     ##     ####       ####   ##   ##  ####     ##   ##   #####\n");
      System.out.printf(" ##  ##    ##      ##  ##   ####     ##       ##  ##  ##   ##   ##      ##   ##  ##   ##\n");
      System.out.printf(" ##  ##    ##     ##       ##  ##    ##      ##       ##   ##   ##      ##   ##  #\n");
      System.out.printf(" #####     ##     ##       ##  ##    ##      ##       ##   ##   ##      ##   ##   #####\n");
      System.out.printf(" ##        ##     ##       ######    ##   #  ##       ##   ##   ##   #  ##   ##       ##\n");
      System.out.printf(" ##        ##      ##  ##  ##  ##    ##  ##   ##  ##  ##   ##   ##  ##  ##   ##  ##   ##\n");
      System.out.printf("####      ####      ####   ##  ##   #######    ####    #####   #######   #####    #####\n\n");
      System.out.printf("-----------------------Developed by Julio Quintero and Johan Daza-----------------------\n");
      System.out.printf("--------------------------------------Version 1.0.2-------------------------------------\n");
      System.out.println("Welcome to PiCalculus");
      System.out.println("Choose a Program:");
      System.out.println("(1)->Program 1");
      System.out.println("(2)->Program 2");
      System.out.println("(3)->Program 3");
         
      var sc = new Scanner(System.in);
      int opt = sc.nextInt();
      sc.close();
      switch (opt) {
         case 1:
            url = "proyectoLen/ejemplos/programa1.txt";
            break;
         case 2:
            url = "proyectoLen/ejemplos/programa2.txt";
            break;
         case 3:
            url = "proyectoLen/ejemplos/programa3.txt";
            break;
         default:
            System.out.println("Fail, run Program 1");
            break;
      }

      CharStream input = CharStreams.fromFileName(url);
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
         //Handlle error unecesary 
      }
	}     
}
