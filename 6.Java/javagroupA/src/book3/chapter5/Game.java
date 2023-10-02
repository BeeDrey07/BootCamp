package book3.chapter5;

public class Game implements Playable{
    @Override
    public void play() {
        System.out.println("Playing.");
    }

    public static void main(String[] args) {
        Game g = new Game();
        g.play();
        g.quit();
    }
}
