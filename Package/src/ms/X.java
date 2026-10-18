package ms;

public class X {
	int m2() {
		System.out.println(11);
		return 45;
	}

	int m2(int y) {
		System.out.println(22);
		return m2();
	}

	int m3(int y, int z) {
		System.out.println(33);
		return m2();
	}

	public static void main(String[] args) {
		X xx = new X();
		System.out.println(xx.m3(xx.m2(), xx.m2()));

	}
}

