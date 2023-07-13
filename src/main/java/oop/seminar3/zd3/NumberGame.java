package oop.seminar3.zd3;

import java.util.ArrayList;
import java.util.List;

public class NumberGame extends AbstractGame{
    @Override
    public List<String> generateCharList() {
        List<String> strlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strlist.add(Integer.toString(i));
        }
        return strlist;
    }

}
