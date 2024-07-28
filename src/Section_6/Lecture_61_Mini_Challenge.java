package Section_6;

public class Lecture_61_Mini_Challenge {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println("Number" + i + " is prime number");
                count++;
            }
            if  (count==3) {
                System.out.println("Found 3- Exiting the program");
                break;
            }
        }
    }

    public static boolean isPrime(int num) {
        boolean flag = true;
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
        } else if (num == 2) {
            System.out.println("Number " + num + " is a prime number");
        } else {
            for (int divisor = 2; divisor < num; ) {
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
