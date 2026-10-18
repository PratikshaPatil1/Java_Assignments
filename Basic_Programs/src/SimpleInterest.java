
public class SimpleInterest {
	
	double calculateSI(double p, double r, double t) {
		
		return (p*r*t)/100;
	}

	public static void main(String[] args) {
		SimpleInterest obj =new SimpleInterest();
		System.out.println(obj.calculateSI(10000, 5, 2));
	}

}
