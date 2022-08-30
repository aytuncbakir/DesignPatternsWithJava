package behavioral.visitor.populationoffice;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public interface Visitor {

    String visitCity(City city);
    String visitState(State state);
    String visitCountry(Country country);

}
