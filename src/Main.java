public class Main {
    public static void main(String[] args) {
        isLeapYear(1);
    }
    public static boolean isLeapYear(int year){
        boolean fail = false;
        boolean pass = true;
        if (year < 1 || year > 9999) {
            System.out.println("Invalid");
        }
        else if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
            System.out.println("isLeapYear = True");
        } else {
            System.out.println("isLeapYear = False");
        }
        return fail;
    }
}