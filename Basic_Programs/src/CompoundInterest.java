public class CompoundInterest {

    double calculateCI(double p, double r, double t) {
        double amount = p * Math.pow(1 + r / 100, t);
        return amount - p;
    }

    public static void main(String[] args) {
        CompoundInterest obj = new CompoundInterest();
        System.out.println(obj.calculateCI(10000, 5, 2));
    }
}                  