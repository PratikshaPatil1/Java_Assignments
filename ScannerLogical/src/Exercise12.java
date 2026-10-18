import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter principal amount:");
    double p = sc.nextDouble();
    
    System.out.println("Enter rate of interest:");
    double r = sc.nextDouble();
    
    System.out.println("Enter time in years:");
    double t = sc.nextDouble();
    
    double si = (p*r*t);
    
    System.out.println("Simple Interest is: " +si);
    
    sc.close();
		
	}

}
