class C extends B {
    public void methodC() {
        System.out.println("Class C method");
    }

    public static void main(String[] args) {
        C obj = new C();

        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}