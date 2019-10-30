import java.lang.Math;
import java.util.ArrayList;

public class HearthOfThon {

    private static boolean battleResult; //false par déf
    private static String[] ranks = new String[] {"Novice", "Fighter", "Warrior", "Veteran", "Sage", "Elite", "Conqueror", "Champion", "Master", "Greatest", "Java > PHP"};

    public static void main (String[] args) {

        launchGame();

    }

    private static void launchGame() {

    }
    
    public class Fight {
    	
    	private static int takeHit(Card card1, Card card2) {
    		int damageDeal= card2.getAttack();
    		card1.setLife((card1.getLife()+card1.getDefense())-card2.getAttack());
    		return damageDeal;	
    	}
    }

    private static String xpGain (double levelJoueur, double levelAdversaire) {

        double levelDiff = levelJoueur - levelAdversaire;
        if (levelDiff > 10) {
            return "Vous ne gagnez pas de points d'expérience.";
        } else if (levelDiff > 5) {
            xpAdd(0.1);
            return "Vous gagnez 10 points d'expérience.";
        } else if (levelDiff > 3) {
            xpAdd(0.2);
            return "Vous gagnez 20 points d'expérience.";
        } else if (levelDiff > 1) {
            xpAdd(0.3);
            return "Vous gagnez 30 points d'expérience.";
        } else if (levelDiff > -1) {
            xpAdd(0.5);
            return "Vous gagnez 50 points d'expérience.";
        } else if (levelDiff > -3) {
            xpAdd(0.8);
            return "Vous gagnez 80 points d'expérience.";
        } else if (levelDiff > -5) {
            xpAdd(1.0);
            return "Vous gagnez 100 points d'expérience.";
        } else if (levelDiff > -10) {
            xpAdd(1.5);
            return "Vous gagnez 150 points d'expérience.";
        } else {
            xpAdd((-levelDiff) * 0.2);
            String result = "Vous gagnez " + ((-levelDiff) * 0.2) + " points d'expérience";
            return result;
        }

    }

    private static void xpAdd (double xp) {
        Player.setExperience(Player.getExperience() + xp);
    }

    private static String uprank () {
        String rank = ranks[(int) (Player.getExperience() / 10)];
        Player.setRank(rank);
        String result = "Votre rang : " + rank;
        return result;
    }

	private static int random (int variation) {
		return (int) (Math.random() * variation - (variation * 2));
	}

}