package Section_6;

public class Lecture_56 {

    public static void main(String[] args) {
        int value = 2;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 either 2");
        }

        // With Switch Statement

        switch (value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 either 2");
        }
    }
}
