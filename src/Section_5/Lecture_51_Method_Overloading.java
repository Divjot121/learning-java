package Section_5;

public class Lecture_51_Method_Overloading {
    public static void main(String[] args) {
        aloo("Amazing");
    }
    public static void aloo(String kulcha) {
        if (kulcha.startsWith("A")) {
            System.out.println("Amazing");
        }
    }
}
