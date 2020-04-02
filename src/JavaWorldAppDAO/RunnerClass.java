package JavaWorldAppDAO;

import java.sql.ResultSet;
import java.sql.SQLException;


public class RunnerClass {

	public static void main(String[] args) throws SQLException {
		CountryDAO CountryDAO = new CountryDAOClass();
 		  
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
	}

}
