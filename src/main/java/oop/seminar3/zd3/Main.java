package oop.seminar3.zd3;
import java.util.List;
import java.util.Scanner;

public class Main
{
    // todo: логирование пользовательских попыток+
    // todo: реализовать рестарт игры+
    // todo: реализовать английскую версию+
    public static void main (String[] args) {
        boolean start =true;
        while (start) {
            AbstractGame game = new NumberGame();
            System.out.println(); // todo: comment Of The Year
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите длину слова:");
            int wordLength = scanner.nextInt();
            System.out.println("Введите количество попыток:");
            int tryCount = scanner.nextInt();
            scanner.nextLine();
            game.start(wordLength, tryCount);
            boolean isFinish = false;
            boolean isWin = false;
            int count = 1;
            while (!(isFinish || isWin)) {
                Answer answer = game.inputValue(scanner.nextLine());
                if (answer != null) System.out.println("Попытка: " + count + "\n совпадения: " + answer);
                isFinish = game.getGameStatus() == GameStatus.FINISH;
                isWin = game.getGameStatus() == GameStatus.WIN;
                count++;
            }
            if (isWin) System.out.println("Вы победили!");
            else System.out.println("Вы проиграли...");
            start =false;
            System.out.println("Показать историю игры: 1 || restart: 2 ");
            int option = scanner.nextInt();
            if (option == 1) {
                game.getLogs();
            }
            if (option == 2) {
                start=true;
            }
        }
    }
}
