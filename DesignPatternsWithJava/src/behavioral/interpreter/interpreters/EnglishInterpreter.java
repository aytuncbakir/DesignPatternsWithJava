package behavioral.interpreter.interpreters;

import behavioral.interpreter.language.English;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class EnglishInterpreter implements Interpreter {

	 @Override
	    public String interpret(String text) {
	        English english = new English();
	        String interpretation = english.interpret(text);
	        return interpretation;
	    }
}
