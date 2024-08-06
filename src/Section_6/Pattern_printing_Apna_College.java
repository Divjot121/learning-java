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
        // if (i == 1 || j == 1 || i == n || j == m) { // if i or j are equal's to 1 or i equals to n or j equals to m then print the start (*)
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
        // for (int j = 4; j>=i; j--) { // here j's value is 4 and till j >=i decrement it and print the star (*)
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 5. Inverted Half Pyramid Rotated By 180 Degrees
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 3; j >= i; j--) { // here we are printing the space from 3 to 1 by decrementing till j is greater than i
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {  // here we are printing the star (*) normally as we did with half pyramid
        // it is recommended to use different var rather than reassigning the already assigned var
        // System.out.print(" * ");
        // }
        // System.out.println();
        // }

        // 6. Half Pyramid With Numbers

        // int n = 5;
        // for (int i = 1; i<=n; i++) {
        // for (int j = 1; j<=i; j++) {
        // System.out.print(" " + j + " "); // same logic but printed j's value directly instead of *
        // }
        // System.out.println();
        // }

        // 7. Inverted Half Pyramid With Numbers
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n-i+1; j++) { // n-i+1 will minus current i value and increment it by 1
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
//                if (sum % 2 == 0) { // if sum of i and j is even then print 1 else (odd) print 0
//                    System.out.print(" 1 ");
//                } else {
//                    System.out.print(" 0 ");
//                }
//            }
//            System.out.println();
//        }

        // 11. Butterfly Pattern
//        int n = 5;
//        //upper half
//        for (int i = 1; i <= n; i++) {
//            // 1st part
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            // space
//            int spaces = 2 * (n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print("   ");
//            }
//
//            // 2nd part
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }
//
//        //lower half
//        for (int i = n; i >= 1; i--) {
//            // 1st part
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            // space
//            int spaces = 2 * (n-i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print("   ");
//            }
//
//            // 2nd part
//            for (int j = 1; j <= i; j++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 12. Solid Rhombus
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print("   ");
//            }
//            for (int k = 1; k <= n; k++) {
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // 13. Number Pyramid
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j < n-i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        // 14. Palindromic Pattern
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j >= 1; j--) {
//                System.out.print(j + " ");
//            }
//            // 2nd half number
//            for (int j = 2; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        // 15. Diamond Pattern
//        int n = 5;
//
//        // upper half
//         for(int i=1; i<=n; i++) {
//                   //spaces
//                   for(int j=1; j<=n-i; j++) {
//                       System.out.print("   ");
//                   }
//                   for(int j=1; j<=2*i-1; j++) {
//                       System.out.print(" * ");
//                   }
//                   System.out.println();
//               }
//
//
//               //lower part
//               for(int i=n; i>=1; i--) {
//                   //spaces
//                   for(int j=1; j<=n-i; j++) {
//                       System.out.print("   ");
//                   }
//                   for(int j=1; j<=2*i-1; j++) {
//                       System.out.print(" * ");
//                   }
//                   System.out.println();
//               }

//  <-------------------------------------------------->END<---------------------------------------------------------------->


    }
}
