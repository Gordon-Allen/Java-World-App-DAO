package JavaWorldAppDAO;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class RunnerClass {

	public static void main(String[] args) throws SQLException {
		CountryDAO CountryDAO = new CountryDAOClass();
		Scanner scanner = new Scanner(System.in);
 		  
//		//print all Countries
//		for (Country s : CountryDAO.getAllCountries())
//		{
//			System.out.println("Country_ID: [Id : "+s.getCountry_id()+", City_ID : "+s.getCity_id() 
//			+ "   , Name : "+s.getCountry_name()+", Population : "+s.getPopulation() + " ]");
//		}
		
		//print all Countries * Cities
		
		ResultSet rs = CountryDAO.getAllCountriesCity();
		while(rs.next())
		{
			System.out.println("COUNTRY #" + rs.getInt("country_id"));
			System.out.println("Country Name:" + rs.getString("country_name"));
			System.out.println("Country Population: " + rs.getInt("population"));
			System.out.println(" ");
			
			System.out.println("ASSOCIATED CITY FOR COUNTRY #" + rs.getInt("country_id"));
			System.out.println("City_ID: " + rs.getInt("city_id"));
			System.out.println("City Name: " + rs.getString("city_name"));

			System.out.println(" ");
			System.out.println(" ");
		}
		
		System.out.println("Please enter the Country's ID you would like to update:");
		String countryID = scanner.nextLine();
		
		Country resultC = CountryDAO.getCountry(Integer.parseInt(countryID));
		
		System.out.println("Country You Selected:");
		System.out.println(" ");
		System.out.println("Country_ID:" +resultC.getCountry_id());
    	System.out.println("Country Name:" +resultC.getCountry_name());
    	System.out.println("Population:" +resultC.getPopulation());
    	System.out.println(" ");
		
		System.out.println("Please enter the new population total");
		String population = scanner.nextLine();
		
		CountryDAO.updateCountryPopulation(Integer.parseInt( countryID ), Long.parseLong( population ) );
	}
}
