
public class Method_Ex1 {
	
	int x =10;
	int y=20;
	float z;
	
	void add() {
		z=x+y;
		display(z);
	}

	void sub() {
		z=x-y;
		display(z);
	}
	
	void mult() {
		z=x*y;
		display(z);
	}
	
	void div() {
		z= x/y;
		display(z);
	}
	
	void display(float ans) {
		System.out.println("Answer is: "+ ans);
	}
}
