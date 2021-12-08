package sandwich;

public class Sandwich {
	String tomat ;
	String onion  ;
	String saus ;
	int tomatPrice = 10 ;
	int onionPrice = 15 ;
	int sausPrice = 5 ;
	int naturPrice = 50;
	int totalPrice;
	static int noOfreicept = 0;
	
	// we have many constructor to make different object from this class depends of it's parameters

	public Sandwich() {
		totalPrice = naturPrice;
		noOfreicept++;
	}

	public Sandwich(String tomat) {
//		this.tomat = tomat;
		totalPrice = naturPrice + tomatPrice ;
		noOfreicept++;
	}

	public Sandwich(String tomat, String onion) {
		this.tomat = tomat;
		this.onion = onion;
		totalPrice = naturPrice + this.tomatPrice + this.onionPrice;
		noOfreicept++;
	}

	public Sandwich(String tomat, String onion, String saus) {
		this(tomat, onion);
		this.saus = saus;
		totalPrice = naturPrice + this.tomatPrice + this.onionPrice + this.sausPrice;
		noOfreicept++;
	}

	public void price() {
		System.out.printf("your no is %d the price is %d\n", noOfreicept, this.totalPrice);
	}

}
