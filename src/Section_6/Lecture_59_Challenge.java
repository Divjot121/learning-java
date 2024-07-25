package Section_6;

public class Lecture_59_Challenge {
    public static void main(String[] args) {
        printDayOfWeek(7);
        printWeekDay(1);
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0, 7 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid argument!");
        }
    }

    public static void printWeekDay(int day) {
        if (day == 0 || day == 7) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid Argument!");
        }
    }
}
