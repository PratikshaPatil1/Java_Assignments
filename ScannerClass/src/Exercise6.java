import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
        int age = scan.nextInt();
        
        scan.nextLine();
        
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
        
        scan.close();
	}

}
