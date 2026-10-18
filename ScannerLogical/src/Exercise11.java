import java.util.Scanner;


public class Exercise11 {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    int num = sc.nextInt();
    
    int cube = num * num * num;
    
    System.out.println("Cube of the number is: " + cube);
    
    sc.close();
		
	}

}
