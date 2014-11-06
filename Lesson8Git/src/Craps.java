
import java.net.URL;
import javax.swing.ImageIcon;

public class Craps {

    public static String checkFirstRoll(int die1, int die2) {
        int roll = die1 + die2;
        String GameStatus;
        GameStatus = "Error occured";
        if (roll == 2 || roll == 3 || roll == 12) {
            GameStatus = "Lose";
        } else if (roll == 7 || roll == 11) {
            GameStatus = "Win";
        } else {
            GameStatus = "Roll a " + roll + " to win, 7 to lose";
        }
        return GameStatus;
    }

}
