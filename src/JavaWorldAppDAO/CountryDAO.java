package JavaWorldAppDAO;

import java.sql.ResultSet;
import java.util.List;

public interface CountryDAO
{
	public Country getCountry(int country_id);
	public List<Country> getAllCountries();
	public ResultSet getAllCountriesCity();
	public boolean updateCountry(Country country);
	public boolean updateCountryPopulation(int countryID, long population);
	public void deleteCountry(Country country);

}
