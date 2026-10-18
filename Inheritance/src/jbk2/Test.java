package jbk2;

 class Test {
	 public void methodB() {
		 System.out.println("method of Class B");
	 }

	public static void main(String[] args) {
		B obj1 = new B();
		C obj2 = new C();
		D obj3 = new D();
		obj1.methodA();
		obj2.methodA();
		obj3.methodA();

	}

}
