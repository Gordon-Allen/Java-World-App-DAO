package JavaWorldAppDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CountryDAOClass implements CountryDAO{
	
	List<Country> countryList;

	public CountryDAOClass() {
		countryList = new ArrayList<Country>();
	}
	
	@Override
	public List <Country> getAllCountries()
	{
		Connection con = CountryConnectionFactory.getConnection();
		try
		{
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM Country");
			List<Country> countryList = new ArrayList<Country>();
			
			while(rs.next())
			{
			Country s = new Country();
			s.setCountry_id(rs.getInt("country_id"));
			s.getCity_id(rs.getInt("city_id") );
			s.setCountry_name(rs.getString("country_name") );
			s.setPopulation(rs.getLong("population") );
			countryList.add(s);
			}
			return countryList;
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return null;
	}	   

	@Override
	public Country getCountry(int id)
	{
		Connection con = CountryConnectionFactory.getConnection();
		try
		{
			Statement stmt = con.createStatement();
		    ResultSet rs = stmt.executeQuery("SELECT * FROM Countrys WHERE CountryID=" + id);
		    if(rs.next())
		    {
		    	Country s = new Country();
		    	s.setCountry_id(rs.getInt("country_id"));
				s.setCity_id(rs.getInt("city_id") );
				s.setCountry_name(rs.getString("country_name") );
				s.setPopulation(rs.getLong("population") );
		        return s;
		    }
		}
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	   
	@Override
	public boolean updateCountry(Country c)
	{
		Connection connection = CountryConnectionFactory.getConnection();
		try
		{
			PreparedStatement ps = connection.prepareStatement("UPDATE Country SET country_id=?, city_id=?, country_name=?, population=? WHERE country_id=?");
			ps.setInt(1, c.getCountry_id());
			ps.setInt(1, c.getCity_id());
			ps.setString(2, c.getCountry_name());
		    ps.setLong(3, c.getPopulation());
		    
		      
		    int i = ps.executeUpdate();

		    if(i == 1)
		    {
		    	return true;
		    }
		 }
		catch (SQLException ex)
		{
			ex.printStackTrace();
		}
		return false;
	}
	   
	@Override
	public void deleteCountry(Country country) {}
}

