import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter principle amount: ");
		double p = sc.nextDouble();
		
		System.out.println("Enter rate of interest: ");
		double r=sc.nextDouble();
		
		System.out.println("Enter time in years: ");
		double t = sc.nextDouble();
		
		double amount = p * Math.pow(1+ r/100,t);
		
		double ci= amount - p;
		
		System.out.println("Compound Interest is: "+ci);
		System.out.println("Total Amount is:" +amount);
		
		sc.close();

		
	}

}
