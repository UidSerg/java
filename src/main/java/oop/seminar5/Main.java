package oop.seminar5;

public class Main {
    public static void main(String[] args) {
        Game game = new Game() {
            @Override
            public void start(){
                System.out.println("Игра началась");
            }
        };
        System.out.println(game.getClass().getName());
        AbstractGame abstractGame = new AbstractGame() {
            @Override
            public void info() {
                System.out.println("информация об игре");
            }
        };
        abstractGame.info();
    }
}
