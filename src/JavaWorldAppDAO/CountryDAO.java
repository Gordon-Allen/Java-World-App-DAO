package JavaWorldAppDAO;

import java.util.List;

public interface CountryDAO
{
	public Country getCountry(int country_id);
	public List<Country> getAllCountries();
	public boolean updateCountry(Country country);
	public void deleteCountry(Country country);

}
