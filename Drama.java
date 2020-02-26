package Sample;

public class Drama extends Movie{
	private String synopsis;
	
	public Drama () {
		
	}	
	public Drama (String title, int year, int duration, String country, double rate, String synopsis) {
			
		this.synopsis = synopsis;
	}
	
	public String synopsis () {
		return synopsis;
		
	}
	public void setSynopsis (String synopsis) {
		this.synopsis = synopsis;
	}
	
	public String getSynopsis () {
		return this.synopsis;
	}
	
	public void overview (String about) {
		System.out.println("Film Sysnopsis: " + about);
		
	}
	public int add (int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	public int add (int ... a) {
		int sum = 0;
		for (int num: a) {
			sum += num;
		}
		return sum;
	}
}
