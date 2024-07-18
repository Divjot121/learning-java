public class Challenge_1 {
    public static void main(String[] args) {
        double var1 = 20.00;
        double var2 = 80.00;
        double total =( var1 + var2) * 100;
        double remainder = total % 40.00;
        System.out.println(remainder);
        boolean bool = (remainder == 0) ? true : false;
        System.out.println(bool);
    }
}
