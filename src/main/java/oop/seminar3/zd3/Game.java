package oop.seminar3.zd3;

import java.util.List;

public interface Game
{
      void start (int wordLength, int attempts);

      Answer inputValue (String input);

      GameStatus getGameStatus ();
      void getLogs();

}