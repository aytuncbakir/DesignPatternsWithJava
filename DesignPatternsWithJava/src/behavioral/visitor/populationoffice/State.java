package behavioral.visitor.populationoffice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class State {

    private String name;
    private List<City> cityList;

    public State(String name) {
        this.name = name;
        cityList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitState(this);
    }

    public void addCity(City city){
    	cityList.add(city);
    }


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}

   
}
