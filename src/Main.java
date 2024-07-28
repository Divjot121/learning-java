//* this is for testing purposes

public class Main {
    public static void main(String[] args) {
        System.out.println(hasTeen(14));

        for (int i = 100; i > 0; i += 10) {
            System.out.println(i);
        }
    }

    public static boolean hasTeen(int first) {
        if (first >= 13 && first <= 19) {
            return true;
        } else {
            return false;
        }


    }
}