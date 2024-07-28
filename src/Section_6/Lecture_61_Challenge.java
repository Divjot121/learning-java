package Section_6;

import java.util.Scanner;

public class Lecture_61_Challenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int numInput = scanner.nextInt();
        isPrime(numInput);
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else if (num == 2) {
            System.out.println("Number " + num + " is a prime number");
        } else {
            for (int divisor = 2; divisor < num;) {
                if (num % divisor == 0) {
                    System.out.println("Number " + num + " is not a prime number");
                    flag = false;
                    break;
                } else {
                    System.out.println("Number " + num + " is a prime number");
                    break;
                }

            }
        }
        return flag;
    }
}
