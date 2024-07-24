package Section_6;

public class Lecture_56 {

    public static void main(String[] args) {
        int value = 4;
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
            case 3: case 4: case 5: {
                System.out.println("Value was 3, 4 or 5");
                }
                break;
            default:
                System.out.println("Value was more than 5");
        }
    }
}
