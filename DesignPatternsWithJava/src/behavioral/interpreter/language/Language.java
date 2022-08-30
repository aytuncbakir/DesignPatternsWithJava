package behavioral.interpreter.language;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public abstract class Language {

   
    public String interpretToTurkish(String text) {
    	return "Finlandiyaya hoş geldiniz!";		
    }
    
    public String interpret(String text) {
        return interpretToTurkish(text);
    }

}
