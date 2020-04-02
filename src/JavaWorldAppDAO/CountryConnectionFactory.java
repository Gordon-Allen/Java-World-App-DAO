package JavaWorldAppDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.cj.jdbc.Driver;

public class CountryConnectionFactory
{
	private static final String url = "jdbc:mysql://database-7.ctiembqzvsd8.us-east-1.rds.amazonaws.com:3306/WorldApp?serverTimezone=EST5EDT";
	private static final String user = "admin";
	private static final String  password = "admin123";
	Connection con;

	public static Connection getConnection()
    {
		try
		{
			DriverManager.registerDriver(new Driver());
			return DriverManager.getConnection(url, user, password);
		}
		catch (SQLException ex)
		{
			throw new RuntimeException("Error Connecting To The Database", ex);
		}
    }

}
