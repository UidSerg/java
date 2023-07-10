package oop.seminar3.zd3;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game{
    protected int wordLength;
    protected int tryCount;
    protected String word;
    protected GameStatus status = GameStatus.INIT;

    public AbstractGame() {
    }

    public AbstractGame(int wordLength, int tryCount, String word, GameStatus status) {
        this.wordLength = wordLength;
        this.tryCount = tryCount;
        this.word = word;
        this.status = status;
    }

    @Override
    public void start(int lengthWord, int countTry) {
        status = GameStatus.START;
        this.wordLength =lengthWord;
        this.tryCount = countTry;
        word =generateWord();
    }

    private String generateWord() {
        Random random = new Random();
        List<String> strList = generateCharList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordLength; i++) {
            int idx = random.nextInt(strList.size());
            sb.append(strList.get(idx));
            strList.remove(idx);
        }
        return sb.toString();
    }
public abstract List<String> generateCharList();
    @Override
    public Answer inputValue(String value) {
        if (--tryCount==0){status = GameStatus.FINISH;}
        if(status == GameStatus.FINISH){throw  new RuntimeException("game over");}
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == word.charAt(i)) bulls++;
            if(word.contains(String.valueOf(value.charAt(i) ))) cows++;
        }
        if(bulls == wordLength) status = GameStatus.WIN;
        return new Answer(bulls,cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return null;
    }
}
