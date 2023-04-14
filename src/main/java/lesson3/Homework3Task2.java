package lesson3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

public class Homework3Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int min = Collections.min(numbers);
        int max = Collections.max(numbers);

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);
    }
}

