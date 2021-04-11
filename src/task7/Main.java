package task7;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}