package ru.gb.seminars.seminar4;
import java.util.Deque;
import java.util.LinkedList;

public class Zd5 {
    public static void main(String[] args) {
        System.out.println("simplifyPath(\"/home/\") = " + simplifyPath("/home/"));
        System.out.println("simplifyPath(\"/../\") = " + simplifyPath("/../"));
        System.out.println("simplifyPath(\"/home//foo/\") = " + simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)) {
                if (!deq.isEmpty()) {
                    deq.pollFirst();
                }
            } else if (!".".equals(s) && !"".equals(s)) {
                deq.add(s);
            }
        }
        if (deq.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        while (!deq.isEmpty()) {
            res.append("/").append(deq.pop());
        }
        return res.toString();
    }

}
