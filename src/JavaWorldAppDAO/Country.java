package JavaWorldAppDAO;

public class Country {
	
	private int country_id;
	private int city_id;
	private String country_name;
	private long population;
	private City city;
	

	public Country() {}


	public int getCountry_id() {
		return country_id;
	}


	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getCity_id() {
		return city_id;
	}


//	public int getCity_id(int i) {
//		return city_id;
//	}


	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}


	public String getCountry_name() {
		return country_name;
	}


	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}


	public long getPopulation() {
		return population;
	}


	public void setPopulation(long population) {
		this.population = population;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}

}
