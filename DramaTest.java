package Sample;
import java.lang.*;

public class DramaTest {


	public static void main(String[] args) {
		Drama d1 = new Drama ();
		Movie m1 = new Movie ();
		m1.setTitle("A Second Chance");
		m1.setYear (2015);
		
		Movie m2 =  new Movie ("Titanic", 1997, 194, "United States", 4.8);
		Drama dr1 = new Drama ("A Second Chance", 2015, 130, "Philippines", 4.3,
				"After their storybook wedding, Popoy and Basha find married life and starting a business, more challenging than they ever imagined.");
		Drama dr2 = new Drama ("Titanic", 1997, 194, "United States", 4.8, 
				"The Titanic is a powerful story of survival, love and heroism. A love story that will never let go of the hearts of the people around the world. Deep on the bottom of the sea, some 3800 meters below the surface of the freezing Atlantic Ocean, lies the wreckage of a ship.");
				
		System.out.println("Total Number of Movie Reviews: " + dr1.add (6, 18, 36, 25, 7, 15, 2, 11));
		System.out.println();
		
		System.out.println("Movie Review has been made...");
		System.out.println("Title: " + m1.getTitle());
		System.out.println("Synopsis: " + dr1.getSynopsis ());
		System.out.println("Duration in Minutes: " + dr1.getDuration());
		System.out.println("Year: " + dr1.getYear ());
		System.out.println("Country: " + dr1.getCountry ());
		System.out.println("Rate: " + dr1.getRate ());
		
		
		System.out.println();
		
		System.out.println("Movie Review has been made...");
		System.out.println("Title: " + m2.getTitle());
		System.out.println("Synopsis: " + dr2.getSynopsis ());
		System.out.println("Duration in Minutes: " + m2.getDuration());
		System.out.println("Year: " + m2.getYear ());
		System.out.println("Country: " + m2.getCountry ());
		System.out.println("Rate: " + m2.getRate ());
		
		
	}


}
