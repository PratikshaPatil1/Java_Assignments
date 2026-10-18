import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int num = scan.nextInt();
		
		System.out.print("The number entered by user: " + num);
		
		scan.close();

	}

}
