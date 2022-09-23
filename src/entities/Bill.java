package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double cover(double feeding) {
		double couver;

		if (feeding > 30) {
			couver = 0;
		} else {
			couver = 4;
		}
		return couver;
	}

	public double feeding() {
		
		double feeding =  beer*5 + barbecue*7 + softDrink*3;
		return feeding;
	}

	public double ticket() {
		double ticket = 0;
		
		if (gender == 'F') {
			 ticket = 8;
		} else {
			if (gender == 'M') {
				ticket = 10;
			}

		}
		return ticket;		

	}

	public double total(double couver, double feeding, double ticket) {
		
		double total =  couver + feeding + ticket;
		return total;

	}

}
