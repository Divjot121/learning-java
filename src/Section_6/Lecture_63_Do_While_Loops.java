package Section_6;

public class Lecture_63_Do_While_Loops {
    public static void main(String[] args) {
//        // For Loop:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        // While Loop:
        int i = 10;
        while (i < 20) {
            i++;
            System.out.println(i);
        }
        // Do While Loop:
        int j = 22;
        boolean isReady = true;
        do {
            if (j > 30) {
                break;
            }
            i++;
            System.out.println(i);
        } while (isReady); {
            System.out.println(i);
            i++;
        }



        int number = 0;
        while (number < 50) {
            number+=5;
            System.out.print(number + "_");
        }
    }
}
