/*
We write a program that simulates a boxing match using Java Classes.
 */

public class Main {
    public static void main(String[] args) {

        Fighters f1 = new Fighters("Alican", 10, 120, 80, 30);
        Fighters f2 = new Fighters("Dilan", 15, 100, 60,40);

        Game game = new Game(f1, f2, 60, 80);
        game.run();
    }
}