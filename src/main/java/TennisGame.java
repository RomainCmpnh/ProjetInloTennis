// TennisGame.java
public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    private int playerOneScore = LOVE;
    private int playerTwoScore = LOVE;

    public void playerOneScores() {
        playerOneScore++;
    }

    public void playerTwoScores() {
        playerTwoScore++;
    }

    private String translateScore(int score) {
        switch (score) {
            case LOVE:
                return "Love";
            case FIFTEEN:
                return "Fifteen";
            case THIRTY:
                return "Thirty";
            case FORTY:
                return "Forty";
            default:
                return "Error";
        }
    }

    public String getScore() {
        // Score égal
        if (playerOneScore == playerTwoScore) {
            if (playerOneScore >= FORTY) {
                return "Deuce";
            }
            return translateScore(playerOneScore) + "-All";
        }

        // Vérification de la victoire ou de l'avantage
        if (playerOneScore >= FORTY || playerTwoScore >= FORTY) {
            int scoreDiff = playerOneScore - playerTwoScore;

            if (scoreDiff >= 2) {
                return "Win for player 1";
            }
            if (scoreDiff <= -2) {
                return "Win for player 2";
            }
            if (scoreDiff == 1) {
                return "Advantage player 1";
            }
            if (scoreDiff == -1) {
                return "Advantage player 2";
            }
        }

        // Score normal
        return translateScore(playerOneScore) + "-" + translateScore(playerTwoScore);
    }
}