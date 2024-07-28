package Section_6;

public class Interest_Calc {
    public static void main(String[] args) {

        System.out.println("12000 at 10% is " + calculateInterest(12000, 10));

        for (double rate = 2.0; rate < 6; rate++) {
            double amount = 10000;
            double interestAmount = calculateInterest(amount, rate);
            System.out.println(amount + " at " + rate + " is " + interestAmount);
        }
    }

    public static double calculateInterest(double amount, double interest) {

        double iFinal = amount * interest / 100;
//        double total = iFinal + amount;
//        System.out.println("The Total is " + total);
        return (amount * (interest / 100));
    }
}
