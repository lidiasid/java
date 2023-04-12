package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)

public class Homework3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println("Original list: " + numbers);
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("List without even numbers: " + numbers);
    }

}


