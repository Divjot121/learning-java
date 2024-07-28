package Section_5;

public class Lecture_43_CodeBlocks_ControlFlow {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 2000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver == true && score >= 3000) {
            System.out.println("Good");
        } else if (gameOver == false) {
            System.out.println("Game is not over yet.");
        } else {
            System.out.println("Better luck next time, " + score + " Thanks for playing!");
        }
    }
}
