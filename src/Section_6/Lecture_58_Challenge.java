package Section_6;

public class Lecture_58_Challenge {
    public static void main(String[] args) {
        char charLetter = 'X';
        switch (charLetter) {
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                    System.out.println("C is charlie");
                    break;
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                    System.out.println("E is Easy");
                    break;
            default:
                System.out.println(charLetter + " is not found in switch statement");
        }
    }
}
