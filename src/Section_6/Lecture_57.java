package Section_6;

public class Lecture_57 {
    public static void main(String[] args) {
        int value = 4;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 either 2");
        }

        // With Switch Statement

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            case 4,5,6 -> {
                System.out.println("Value was 4,5 or 6");
            }
            default -> System.out.println("Value was not 1 either 2");
        }
    }
}
