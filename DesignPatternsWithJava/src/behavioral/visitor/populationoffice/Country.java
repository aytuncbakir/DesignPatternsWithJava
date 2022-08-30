package behavioral.visitor.populationoffice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class Country {

    private String name;
    private List<State> stateList;

    public Country(String name) {
        this.name = name;
        stateList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitCountry(this);
    }

    public void addState(State state){
    	stateList.add(state);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public List<State> getStateList() {
		return stateList;
	}

	public void setStateList(List<State> stateList) {
		this.stateList = stateList;
	}

    
}
