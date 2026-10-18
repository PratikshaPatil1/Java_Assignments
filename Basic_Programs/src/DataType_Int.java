
public class DataType_Int {
	
	int a=15000;
	int b=-20000;
	
	void add() {
		int c=a+b;
		System.out.println("The int value is: " +c);
	}

	public static void main(String[] args) {

		DataType_Int obj = new DataType_Int();
		obj.add();
	}

}
