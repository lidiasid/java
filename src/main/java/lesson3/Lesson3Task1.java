package lesson3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Lesson3Task1 {
    public static void main(String[] args) {
        ex0();
        ex1();
        ex2();
    }

    private static void ex0() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

        System.out.println(s1 == s5);
        System.out.println(s1.equals(s5));
    }

    private static void ex1() {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            list.add(random.nextInt(20)); //0 - 19
        }

        System.out.println(list);
        Collections.sort(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }

    // 3. Доделать начатое на семинаре. Пройтись по списку из задания 2 и удалить повторяющиеся элементы.

    public static void ex2() {
        List<String> planetsNames = List
                .of("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluto");
        Random random = new Random();
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            list.add(planetsNames.get(random.nextInt(9)));
        }

        System.out.println("Original list: " + list);
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println("List without duplicates: " + list);

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + list);
    }
}


