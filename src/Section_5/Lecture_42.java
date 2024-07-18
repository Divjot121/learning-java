package Section_5;

public class Lecture_42 {
    public static void main(String[] args) {
        int myVariable = 50; // this whole line is a statement
        System.out.println(myVariable);
        myVariable++;
        myVariable--;
        System.out.println(myVariable);

        System.out.println("this whole line is a statement"); // Statements can be multiline for example

        System.out.println("hello " +
                "world ");

        int anothervar = 50;
        int var1 = 60;
        System.out.println(anothervar + var1);
        if (anothervar == 0) {
            System.out.println("now it's zero");
        }
    }
}
