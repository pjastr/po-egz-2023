package sports;

public class TestFootballPlayer {

    public static void main(String[] args) {
        FootballPlayer player1 = new FootballPlayer("Ronaldo", new int[]{1, 2, 3, 4, 5});
        FootballPlayer player2 = null;
        try {
            player2 = player1.clone();
            System.out.println(player1);
            System.out.println(player2);
            player1.changeLastGoal(10);
            System.out.println(player1);
            System.out.println(player2);
        } catch (CloneNotSupportedException e) {
            e.getMessage();
        }

    }
}
