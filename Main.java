package sandwich;

public class Main {

	public static void main(String[] args) {
		
		// here we make some objects of class Sandwich
		Sandwich s1 = new Sandwich();
		s1.price();
		Sandwich s2 = new Sandwich("tomat");
		s2.price();
		Sandwich s3 = new Sandwich("tomat", "onion");
		s3.price();
		Sandwich s4 = new Sandwich("tomat", "onion", "suas");
		s4.price();
		
		
	}

}
