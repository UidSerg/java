package oop.seminar3.zd3;

import java.util.ArrayList;
import java.util.List;

public class RuGame extends AbstractGame{
    @Override
    public List<String> generateCharList() {
        List<String> strlist = new ArrayList<>();
        for (int i = 'а'; i <= 'я'; i++) {
            strlist.add(Character.toString(i));
        }
            return strlist;
    }
}
