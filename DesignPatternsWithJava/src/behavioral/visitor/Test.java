package behavioral.visitor;

import behavioral.visitor.populationoffice.Citizen;
import behavioral.visitor.populationoffice.City;
import behavioral.visitor.populationoffice.Country;
import behavioral.visitor.populationoffice.State;
import behavioral.visitor.procedures.AmaounOfCitizenUnderThirtyAndFemaleVisitor;
import behavioral.visitor.procedures.AmaounOfCitizenUnderThirtyAndMaleVisitor;
import behavioral.visitor.procedures.AmaounOfCitizenUnderThirtyVisitor;
import behavioral.visitor.procedures.AmaounOfCitizenUpThenThirtyVisitor;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        
        Citizen citizen1 = new Citizen(123456, "Ali", 23, "Male");
        Citizen citizen2 = new Citizen(123456, "Can", 22, "Male");
        Citizen citizen3 = new Citizen(123456, "Ece", 67, "Female");
        Citizen citizen4 = new Citizen(123456, "Ahmet", 18, "Male");
        Citizen citizen5 = new Citizen(123456, "Ahmet", 32, "Male");
        Citizen citizen6 = new Citizen(123456, "Ahmet", 30, "Male");
        Citizen citizen7 = new Citizen(123456, "Ece", 17, "Female");
        Citizen citizen8 = new Citizen(123456, "Ece", 27, "Female");
        Citizen citizen9 = new Citizen(123456, "Ece", 33, "Female");

        City city = new City("Jyväskylä");
        city.addCitizen(citizen1);
        city.addCitizen(citizen2);
        city.addCitizen(citizen3);
        city.addCitizen(citizen4);
        
        City city2 = new City("Helsinki");
        city.addCitizen(citizen5);
        city.addCitizen(citizen6);
        city.addCitizen(citizen7);
        city.addCitizen(citizen8);
        city.addCitizen(citizen9);
       
        State keskiSuomi = new State("Keski Suomi");
        keskiSuomi.addCity(city);
        
        State uusimaa = new State("Uusimaa");
        keskiSuomi.addCity(city2);

        Country suomi = new Country("Suomi");
        suomi.addState(uusimaa);
        suomi.addState(keskiSuomi);
        
        AmaounOfCitizenUnderThirtyVisitor amaounOfCitizenUnderThirtyVisitor = new AmaounOfCitizenUnderThirtyVisitor();
        String countCitizen = amaounOfCitizenUnderThirtyVisitor.visitCountry(suomi);
        System.out.println("Population under age 30 : "+countCitizen + " citizen");
        
        AmaounOfCitizenUpThenThirtyVisitor amaounOfCitizenUpThenThirtyVisitor = new AmaounOfCitizenUpThenThirtyVisitor();
        countCitizen = amaounOfCitizenUpThenThirtyVisitor.visitCountry(suomi);
        System.out.println("Population up than age 30 : "+countCitizen + " citizen");
        
        AmaounOfCitizenUnderThirtyAndMaleVisitor amaounOfCitizenUnderThirtyAndMaleVisitor = new AmaounOfCitizenUnderThirtyAndMaleVisitor();
        countCitizen = amaounOfCitizenUnderThirtyAndMaleVisitor.visitCountry(suomi);
        System.out.println("Population under age 30 and Male: "+countCitizen + " citizen");
        
        AmaounOfCitizenUnderThirtyAndFemaleVisitor amaounOfCitizenUnderThirtyAndFemaleVisitor = new AmaounOfCitizenUnderThirtyAndFemaleVisitor();
        countCitizen = amaounOfCitizenUnderThirtyAndFemaleVisitor.visitCountry(suomi);
        System.out.println("Population under age 30 and Female: "+countCitizen + " citizen");
    }

    
}
