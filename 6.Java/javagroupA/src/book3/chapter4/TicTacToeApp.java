package book3.chapter4;

public class TicTacToeApp {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new BetterPlayer();
        PlayTheGame(p1, p2);
    }


    public static void PlayTheGame(Player p1, Player p2) {
        p1.move();
        p2.move();
    }
}

class Player
{

    public int move() {
        for (int i = 0; i < 9; i++) {
            System.out.println("\nThe basic player says:");
            System.out.println("I'll take the first open square!");
            return firstOpenSquare();
        }
        return -1;
    }
    private int firstOpenSquare()
    {
        int square = 0;
        return square;
    }
}

class BetterPlayer extends Player {
    public int move() {
        System.out.println("The better player says: ");
        System.out.println("I'm looking for a good move");
        return findBestMove();
    }
    private int findBestMove() {
        int square = 0;
        return square;
    }
}