public class MainChallenge {
    public static void main(String[] args) {

        int highScorePoisition = calculateHighScorePosition(1500);
        displayHighScorePosition(highScorePoisition, "Ciprian");

        highScorePoisition = calculateHighScorePosition(999);
        displayHighScorePosition(highScorePoisition, "Bianca");

        highScorePoisition = calculateHighScorePosition(499);
        displayHighScorePosition(highScorePoisition, "Iulia");

        highScorePoisition = calculateHighScorePosition(99);
        displayHighScorePosition(highScorePoisition, "Calin");

        highScorePoisition = calculateHighScorePosition(-100);
        displayHighScorePosition(highScorePoisition, "Nacho");
    }

    public static void displayHighScorePosition(int playerPosition, String playerName) {

        System.out.println(playerName + " managed to get into position "
                + playerPosition + " on the highscore list!" );
    }

    public static int calculateHighScorePosition(int playerScore){

        if (playerScore >= 1000) {
            return 1;

        } else if (playerScore >= 500) {
            return 2;

        } else if (playerScore >= 100) {
            return 2;

        }
        return 4;
    }
}
