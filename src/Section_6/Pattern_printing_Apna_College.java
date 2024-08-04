package Section_6;

public class Pattern_printing_Apna_College {
    public static void main(String[] args) {

        // 1. Solid Rectangle Solution
        // int n = 4;
        // int m = 6;
        //
        // for (int i = 1; i <= n; i++){
        // for (int j = 1; j <= m; j++){
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 2. Hollow Rectangle
        // int n = 4;
        // int m = 6;
        //
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print(" * ");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 3. Half Pyramid
        // int n = 4;
        // for (int i = 1; i<=n; i++) {
        // for (int j = 1; j<=i; j++) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 4. Inverted Half Pyramid
        // int n = 4;
        // for (int i = 1; i<=n; i++) {
        // for (int j = 4; j>=i; j--) {
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 5. Inverted Half Pyramid Rotated By 180 Degrees
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 3; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) { // it is recommended to use different var
        // rather than reassigning the already assigned var
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 6. Half Pyramid With Numbers

        // int n = 5;
        // for (int i = 1; i<=n; i++) {
        // for (int j = 1; j<=i; j++) {
        // System.out.print(" " + j + " ");
        // }
        // System.out.println();
        // }

        // 7. Inverted Half Pyramid With Numbers
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i+1; j++) {
//                System.out.print(" " + j + " ");
//            }
//            System.out.println();
//        } // Took Help to complete this

        // 8. Line Wine number pattern
//                int n = 5;
//                for (int i = 1; i <= n; i++) {
//                        for (int j = i; j >= 1; j--) {
//                                System.out.print(" " + j + " ");
//                        }
//                        System.out.println();
//                }

        // 9. Floyd's Triangle
//        int n = 5;
//        int number = 1;
//
//        for (int i = 1; i <= n; i++) {
//            // inner loop
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" " + number + " ");
//                number++;
//            }
//            System.out.println();
//        }

        // 10. 0-1 Triangle
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) { // Conditions
//                int sum = i + j;
//                if (sum%2 == 0) {
//                    System.out.print(" 1 ");
//                } else {
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.println();
//        }

    }
}
