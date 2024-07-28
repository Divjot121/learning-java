package Section_6;

public class Lecture_60_Mini_Challenge {
    public static void main(String[] args) {
        calculateInterest(100);
    }

    public static double calculateInterest(double amount) {
        for (double interestPercentage = 7.5; interestPercentage <= 10; interestPercentage = interestPercentage+0.25) {
            System.out.println(amount * interestPercentage / 100);
        }

        return amount;
    }
}
