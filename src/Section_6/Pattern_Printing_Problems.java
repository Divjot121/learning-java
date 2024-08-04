package Section_6;

public class Pattern_Printing_Problems {
    public static void main(String[] args) {
        //* 1st Problem - Solid Rhombus
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print("  ");
//            }
//            for (int k = 1; k <= n; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        //* 2nd Problem - Number Pyramid
//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //* 3rd Problem - Palindromic Number Pyramid
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //this loop is for the space
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            //this loop is for print number 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            //this loop is for the number in reverse order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + "");
            }
            System.out.println();
        }

    }

}
