package Section_5;

public class Lecture_48_Challenge {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Tim", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " Managed to get into position " + playerPosition + " into high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 0;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
