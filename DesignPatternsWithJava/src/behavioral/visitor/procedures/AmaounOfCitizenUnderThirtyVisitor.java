package behavioral.visitor.procedures;


import java.util.List;

import behavioral.visitor.populationoffice.City;
import behavioral.visitor.populationoffice.Country;
import behavioral.visitor.populationoffice.State;
import behavioral.visitor.populationoffice.Visitor;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class AmaounOfCitizenUnderThirtyVisitor implements Visitor {

	
	@Override
	public String visitCity(City city) {
		int amountOfCitizen = countCitizensInCity(city);
		return String.valueOf(amountOfCitizen);
	}


	@Override
	public String visitState(State state) {
		 int amountOfCitizen = countCitizensInState(state);
	     return String.valueOf(amountOfCitizen);
	}


	@Override
	public String visitCountry(Country country) {
		int amountOfCitizen = countCitizensInCountry(country);
        return String.valueOf(amountOfCitizen);
	}
   

    private int countCitizensInCity(City city) {

        return CalculateUtil.countCitizensUnderThirty(city);
    }

    private int countCitizensInState(State state) {

        List<City> cityList = state.getCityList();

        int citizenCount = 0;
        for (City city : cityList) {
            int citizenCountInCity = countCitizensInCity(city);
            citizenCount = citizenCount + citizenCountInCity;
        }

        return citizenCount;
    }

    private int countCitizensInCountry(Country country) {

        List<State> stateList  = country.getStateList();

        int citizenCount = 0;
        for (State state : stateList) {
            int citizenCountInStates = countCitizensInState(state);
            citizenCount = citizenCount + citizenCountInStates;
        }
        return citizenCount;
    }


	
}
