public class Main {
    public static void main(String[] args) {
        hasTeen(14, 1, 5);
    }
    public static void hasTeen(int first, int second, int third) {
        if (first >= 13) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}