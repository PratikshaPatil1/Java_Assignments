import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter marks of 5 subjects:");
		
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3= sc.nextInt();
		int m4= sc.nextInt();
		int m5= sc.nextInt();

		int total = m1+m2+m3+m4+m5;
		
		double percentage = (total/500.0) *100;
		
		System.out.println("Total Marks: " +total);
		System.out.println("Percentage: " + percentage + "%");
		
		if (percentage >= 60) {
			System.out.println("First Division");
		} else if (percentage >= 50) {
			System.out.println("Second Division");
		} else if (percentage >= 40) {
			System.out.println("Third Division");
		}else {
			System.out.println("Fail");
		}
		
		sc.close();
		
		}


		
				
				
				
				
		
	}


