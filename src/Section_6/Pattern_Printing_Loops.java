package Section_6;

public class Pattern_Printing_Loops {
    public static void main(String[] args) {
    for (int i = 4; i >= 1; i--)  { // Loop for the Row
        for (int j = 1; j <= i; j++) { // Nested Loop for the Column
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
    }
}
