package Section_5;

public class Lecture_52_Challenge {
    public static void main(String[] args) {
        convertToCentimeters(68);
        convertToCentimeters(5, 8);
    }

    public static double convertToCentimeters(int inches){
        double convertToCentimetersValue = inches * 2.54;
        System.out.println(convertToCentimetersValue);
        return convertToCentimetersValue;
    }

    public static double convertToCentimeters(int foot, int inches){
        int convertFootToInchesValue = foot * 12;
        double convertToCentimetersValue = convertFootToInchesValue * 2.54 + inches * 2.54;
        System.out.println(convertToCentimetersValue);
        return convertToCentimetersValue;
    }
}
