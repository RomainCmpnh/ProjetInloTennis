// TennisGameTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TennisGameTest {

    @Test
    void testDeuce() {
        TennisGame game = new TennisGame();
        game.playerOneScores(); // 15-0
        game.playerOneScores(); // 30-0
        game.playerOneScores(); // 40-0
        game.playerTwoScores(); // 40-15
        game.playerTwoScores(); // 40-30
        game.playerTwoScores(); // deuce
        assertEquals("Deuce", game.getScore());
    }

    @Test
    void testAdvantagePlayerOne() {
        TennisGame game = new TennisGame();
        game.playerOneScores(); // 15-0
        game.playerOneScores(); // 30-0
        game.playerOneScores(); // 40-0
        game.playerTwoScores(); // 40-15
        game.playerTwoScores(); // 40-30
        game.playerTwoScores(); // deuce
        game.playerOneScores(); // advantage
        assertEquals("Advantage player 1", game.getScore());
    }

    @Test
    void testVictoireAvecDeuxPointsEcart() {
        TennisGame game = new TennisGame();
        game.playerOneScores(); // 15-0
        game.playerOneScores(); // 30-0
        game.playerOneScores(); // 40-0
        game.playerTwoScores(); // 40-15
        game.playerTwoScores(); // 40-30
        game.playerTwoScores(); // deuce
        game.playerOneScores(); // advantage
        game.playerOneScores(); // win
        assertEquals("Win for player 1", game.getScore());
    }
    @Test
    void nouveauJeuCommenceParLoveAll() {
        TennisGame game = new TennisGame();
        assertEquals("Love-All", game.getScore());
    }

    @Test
    void joueurUnMarqueQuinzeLove() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        assertEquals("Fifteen-Love", game.getScore());
    }

    @Test
    void joueurDeuxMarqueLoveQuinze() {
        TennisGame game = new TennisGame();
        game.playerTwoScores();
        assertEquals("Love-Fifteen", game.getScore());
    }

    @Test
    void deuxJoueursMarquentQuinzePartout() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        game.playerTwoScores();
        assertEquals("Fifteen-All", game.getScore());
    }

    @Test
    void joueurUnMarqueTrenteLove() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        game.playerOneScores();
        assertEquals("Thirty-Love", game.getScore());
    }

    @Test
    void joueurUnMarqueTrenteQuinze() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        game.playerOneScores();
        game.playerTwoScores();
        assertEquals("Thirty-Fifteen", game.getScore());
    }

    @Test
    void joueurUnMarqueQuaranteLove() {
        TennisGame game = new TennisGame();
        game.playerOneScores();
        game.playerOneScores();
        game.playerOneScores();
        assertEquals("Forty-Love", game.getScore());
    }

    @Test
    void joueurUnGagneLaPartie() {
        TennisGame game = new TennisGame();
        game.playerOneScores(); // 15-0
        game.playerOneScores(); // 30-0
        game.playerOneScores(); // 40-0
        game.playerOneScores(); // Win
        assertEquals("Win for player 1", game.getScore());
    }
}