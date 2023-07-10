package oop.seminar3.zd3;

public class Answer {
    private int bulls;
    private int rows;

    public Answer(int bulls, int rows) {
        this.bulls = bulls;
        this.rows = rows;
    }

    public Answer() {
    }

    public int getBulls() {
        return bulls;
    }

    public int getRows() {
        return rows;
    }

    @Override
    public String toString() {
        return "Быки=" + bulls +
                ", коровы=" + rows;
    }
}
