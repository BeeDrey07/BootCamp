package book3.chapter5;

public class CardDeck implements Dealable {
    @Override
    public void deal(int cards) {
        System.out.println("DEALING OUT " + cards + " cards");
    }

    private static void startGame(Dealable deck, String game) {
        if (game.equals("Poker"))
            deck.deal(5);
        else if (game.equalsIgnoreCase("hearts"))
            deck.deal(13);
        else if (game.equals("Gin"))
            deck.deal(10);
    }

    public static void main(String[] args) {
        CardDeck d = new CardDeck();
        startGame(d, "hearts");
        startGame(d, "Gin");
    }
}
