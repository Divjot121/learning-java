package Section_6;

public class Lecture_65_Challenge {
    public static void main(String[] args) {
        System.out.println("The sum of digits in number 1234 " + "is " + sumDigits(88));
        System.out.println("The sum of digits in number 1234 " + "is " + sumDigits(1234));
        System.out.println("The sum of digits in number 1234 " + "is " + sumDigits(-1234));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 9) {
            sum += (number % 10);
            number = number / 10;
        }

        sum += number;
        return sum;

    }
}
