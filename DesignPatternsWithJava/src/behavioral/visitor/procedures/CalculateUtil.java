package behavioral.visitor.procedures;


import java.util.List;

import behavioral.visitor.populationoffice.Citizen;
import behavioral.visitor.populationoffice.City;


/**
 * @author Aytunc Bakir
 * @since 1.0.0
 */
public class CalculateUtil {

    public static int countCitizensUnderThirty(City city){

        List<Citizen> cityList = city.getCitizenList();

        int citizenCount = 0;
        for (Citizen citizen : cityList) {
            if (citizen.getAge() <30){
            	citizenCount++;
            }
        }
        return citizenCount;
    }
    
    public static int countCitizensUpThanThirty(City city){

        List<Citizen> cityList = city.getCitizenList();
        return  cityList.size() - countCitizensUnderThirty(city);
        
         
    }
    
    public static int countCitizensUnderThirtyAndMale(City city){

        List<Citizen> cityList = city.getCitizenList();

        int citizenCount = 0;
        for (Citizen citizen : cityList) {
            if (citizen.getAge() <30  && citizen.getGender().equals("Male")){
            	citizenCount++;
            }
        }
        return citizenCount;
    }
    
    public static int countCitizensUnderThirtyAndFemale(City city){

    	  List<Citizen> cityList = city.getCitizenList();

          int citizenCount = 0;
          for (Citizen citizen : cityList) {
              if (citizen.getAge() <30  && citizen.getGender().equals("Female")){
              	citizenCount++;
              }
          }
          return citizenCount;
    }
    
    
    
    


   
}
