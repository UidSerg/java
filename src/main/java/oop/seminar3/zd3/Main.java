package oop.seminar3.zd3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AbstractGame game = new NumberGame();
        System.out.println(); // todo комметрарий
        Scanner scanner= new Scanner(System.in);
        System.out.println("введите длину слова");
        int wordLength = scanner.nextInt();
        System.out.println("введите колличество попыток");
        int tryCount = scanner.nextInt();
        scanner.nextLine();
        game.start(wordLength,tryCount);
        boolean isFinish = false;
        boolean isWin = false;
        while (!(isFinish || isWin))
        {
            Answer answer = game.inputValue (scanner.nextLine ());
            if (answer != null) System.out.println ("answer = " + answer);
            isFinish = game.getGameStatus () == GameStatus.FINISH;
            isWin = game.getGameStatus () == GameStatus.WIN;
        }
        if (isWin) System.out.println ("Вы победили!");
        else System.out.println ("Вы проиграли...");
    }
}
