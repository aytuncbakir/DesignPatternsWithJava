package behavioral.interpreter;

import behavioral.interpreter.interpreters.EnglishInterpreter;
import behavioral.interpreter.interpreters.FinnishInterpreter;
import behavioral.interpreter.interpreters.GermanInterpreter;
import behavioral.interpreter.interpreters.Interpreter;

public class Test {
	
	 public static void main(String[] args) {

	        String finnishText = getFinnishText();
	        String englishText = getEnglishText();
	        String germanText = getGermanText();

	        System.out.print("Tervetuloa Suomeen! -->");
	        print(finnishText, new FinnishInterpreter());
	        System.out.print("Welcome to Finland! -->");
	        print(englishText, new EnglishInterpreter());
	        System.out.print("Willkommen in Finnland! -->");
	        print(germanText, new GermanInterpreter());

	    }

	    private static void print(String text, Interpreter interpreter) {
	        String interpretToTurkish = interpreter.interpret(text);
	        System.out.println(interpretToTurkish);
	    }

	    private static String getFinnishText() {
	        return "Tervetuloa Suomeen!";
	    }

	    private static String getEnglishText() {
	        return "Welcome to Finland!";
	    }
	    
	    private static String getGermanText() {
	        return "Willkommen in Finnland!";
	    }
	    
}
