
public class Cube {

	int calculateCube(int num) {
		return num *num* num;
	}
	public static void main(String[] args) {

		Cube obj = new Cube();
		System.out.println(obj.calculateCube(3));
	}

}
