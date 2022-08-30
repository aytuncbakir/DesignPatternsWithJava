package behavioral.visitor.populationoffice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class City {

    private String name;
    private List<Citizen> citizenList;

    public City(String adi) {
        this.name = name;
        citizenList = new ArrayList<>();
    }

    public String accept(Visitor visitor){
        return visitor.visitCity(this);
    }

    public void addCitizen(Citizen citizen){
    	citizenList.add(citizen);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Citizen> getCitizenList() {
		return citizenList;
	}

	public void setCitizenList(List<Citizen> citizenList) {
		this.citizenList = citizenList;
	}

    

    
}
