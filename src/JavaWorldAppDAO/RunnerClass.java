package JavaWorldAppDAO;

import JavaWorldAppDAO.Country;
import JavaWorldAppDAO.CountryDAO;
import JavaWorldAppDAO.CountryDAOClass;

public class RunnerClass {

	public static void main(String[] args) {
		CountryDAO StudDAO = new CountryDAOClass();
 		  
		//print all Countries
		for (Country s : StudDAO.getAllCountries())
		{
			System.out.println("Country_ID: [Id : "+s.getCountry_id()+", City_ID : "+s.getCity_id() + "   , Name : "+s.getCountry_name()+", Population : "+s.getPopulation() + " ]");
		}

	}

}
