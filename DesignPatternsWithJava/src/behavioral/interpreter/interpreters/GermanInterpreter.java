package behavioral.interpreter.interpreters;

import behavioral.interpreter.language.German;

/**
 * @author Bahadır Memiş
 * @since 1.0.0
 */
public class GermanInterpreter implements Interpreter {

	 @Override
	    public String interpret(String text) {
	        German german = new German();
	        String interpretation = german.interpret(text);
	        return interpretation;
	    }
}
