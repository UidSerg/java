package oop.seminar3.zd3;

public interface Game {
      void start(int lengthWord, int countTry);
      Answer inputValue(String value);
      GameStatus getGameStatus();
}
