package Section_6;

public class Lecture_57_Switch_More {
    public static void main(String[] args) {
        int value = 4;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 either 2");
        }

        // With Switch Statement

        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3 -> System.out.println("Value was 3");
            case 4,5,6 -> {
                System.out.println("Value was 4,5 or 6");
            }
            default -> System.out.println("Value was not 1 either 2");
        }

        String month = "APR";
        System.out.println(month + " Quarter is " + getQuarter(month) + " Quarter");
    }
    public static String getQuarter(String month) {

        return switch (month) {
            case "JAN", "FEB", "MAR" -> {yield "1st";}
            case "APR", "MAY", "JUN" -> "2nd";
            case "JUL", "AUG", "SEP" -> "3rd";
            case "OCT", "NOV", "DEC" -> "4th";
            default -> {
                String badResponse = "Bad";
                yield badResponse;
            }
        };
    }

}
