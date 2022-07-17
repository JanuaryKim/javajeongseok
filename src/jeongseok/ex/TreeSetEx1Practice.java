package jeongseok.ex;

import java.util.TreeSet;

public class TreeSetEx1Practice {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "a";
        String to = "s";

        set.add("sdffsd");
        set.add("azzaaadd");
        set.add("baaadd");
        set.add("caaaaadd");
        set.add("aaadd");

        System.out.println(set.subSet(from, to+"dffs"));

    }
}
