package book3.chapter2;

public class PlayApp {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.health = 10;
        System.out.println(("Player 1 has a health status of " + p1.health));
        Player p2 = new Player();
        p2.health = 7;
        System.out.println("Player 2 has a health status of " + p2.health);
    }
}
