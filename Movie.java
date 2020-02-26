package Sample;

public class Movie {
	private String title;
	private int year;
	private int duration;
	private String country;
	private double rate;
	
	public Movie () {
		
	}
	
	public Movie (String title, int year, int duration, String country, double rate) {
		this.title = title;
		this.year = year;
		this.duration = duration;
		this.country = country;
		this.rate = rate;
		
	}
	
	public void setTitle (String title) {
		this.title = title;
		
	}
	
	public void setYear (int year) {
		this.year =  year;
		
	}
	
	public void setDuration (int duration) {
		this.duration = duration;
		
	}
	
	public void setCountry (String country) {
		this.country = country;
		
	}
	
	public void setRate (double rate) {
		this.rate = rate;
		
	}
	
	public String getTitle () {
		return this.title;
		
	}
	
	public int getYear () {
		return this.year;
		
	}
	
	public int getDuration () {
		return this.duration;
		
	}
	
	public String getCountry () {
		return this.country;
		
	}
	
	public double getRate () {
		return this.rate;
		
	}
	
	public void direct (String director) {
		System.out.println("Director: " + director);	
	}
	
	public void portray(String portrayal) {
		System.out.println("The movie portrays " + portrayal);
	}
	

}
