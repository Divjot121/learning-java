package Section_6;

public class Lecture_64_Challenge_2 {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= finishNumber) {
            number++;

            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }
            System.out.println(number);
            evenCount++;
            if (evenCount >= 5) {
                break;
            }

        }
        System.out.println("even number is " + evenCount);
        System.out.println("odd number is " + oddCount);
    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2 == 0)) {
            return true;
        } else {
            return false;
        }

    }
}
