package book3.chapter5;

public interface Playable {
    void play();
//    default void showCards() {
//        System.out.println("Open your deck.");
//    }
    default void quit() {
        System.out.println("No Quitting");
    }
}
