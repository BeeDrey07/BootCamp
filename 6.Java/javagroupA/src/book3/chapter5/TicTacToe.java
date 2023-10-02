package book3.chapter5;

public class TicTacToe extends Game implements Playable, CardGame {

    @Override
    public void play() {
        System.out.println("Playing a TicTacToe game.");
    }

    @Override
    public void shuffleCards() {
        System.out.println("Shuffle the cards.");
    }

    public static void main(String[] args) {
//        TicTacToe g = new TicTacToe();
//        g.play();
//        g.shuffleCards();
        Playable g2 = new TicTacToe();
        g2.play();
    }

}

