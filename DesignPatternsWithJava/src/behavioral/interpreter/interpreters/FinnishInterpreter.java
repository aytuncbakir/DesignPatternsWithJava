package behavioral.interpreter.interpreters;

import behavioral.interpreter.language.Finnish;

/**
 * @author aytunc Bakir
 * @since 1.0.0
 */
public class FinnishInterpreter implements Interpreter {

    @Override
    public String interpret(String text) {

        Finnish finnish = new Finnish();
        String interpretation = finnish.interpret(text);
        return interpretation;
    }
    
}
