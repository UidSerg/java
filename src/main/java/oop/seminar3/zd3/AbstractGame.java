package oop.seminar3.zd3;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game
{
    protected int wordLength;

    protected int tryCount;

    protected String word;

    public GameStatus status = GameStatus.INIT;
    protected List<String> logs = new ArrayList<>();

    public AbstractGame(){
    }

    public AbstractGame (int wordLength, int tryCount, String word, GameStatus status)
    {
        this.wordLength = wordLength;
        this.tryCount = tryCount;
        this.word = word;
        this.status = status;
        this.logs = new ArrayList<>();
    }

    @Override
    public void start (int wordLength, int attempts)
    {
        status = GameStatus.START;
        this.wordLength = wordLength;
        this.tryCount = attempts;
        word = generateWord ();
        System.out.println ("word = " + word);
        this.logs.add("Старт игры!\n задуманное слово = " + word);
        System.out.println("Введите Ваш Вариант: ");
    }

    private String generateWord ()
    {
        List <String> strList = generateCharList ();
        Random random = new Random ();
        StringBuilder sb = new StringBuilder ();
        for (int i = 0; i < wordLength; i++)
        {
            int idx = random.nextInt (strList.size ());
            sb.append (strList.get (idx));
            strList.remove (idx);
        }
        return sb.toString ();
    }

    public abstract List <String> generateCharList ();

    @Override
    public Answer inputValue (String input)
    {
        if (--tryCount == 0)
        {
            status = GameStatus.FINISH;
            this.logs.add("Попытки закончились, Вы проиграли!");
            return null;
        }

        int bulls = 0;
        int cows = 0;

        for (int i = 0; i < input.length (); i++)
        {
            if (input.charAt (i) == word.charAt (i)) bulls++;
            if (word.contains (String.valueOf (input.charAt (i)))) cows++;
        }

        if (bulls == wordLength) {
            status = GameStatus.WIN;
            this.logs.add("вы угадали слово");
        }
        this.logs.add("Осталось попыток: "+tryCount+ " Ваш вариант: " +input+ " Быки: " +bulls+ " коровы: "+cows);
        return new Answer (bulls, cows);
    }

    @Override
    public GameStatus getGameStatus ()
    {
        return status;
    }

    public int getTryCount() {
        return tryCount;
    }


    public void getLogs() {
        for (String elem:logs) {
            System.out.println("_____________________________");
            System.out.println(elem);
        }

    }

    public void setStatus(GameStatus status) {
        this.status = status;
    }
}