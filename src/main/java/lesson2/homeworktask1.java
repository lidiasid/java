package lesson2;

import java.util.Scanner;
import java.util.stream.IntStream;
//1. Напишите метод, который принимает на вход строку (String) и
// определяет является ли строка палиндромом (возвращает boolean значение).

public class homeworktask1 {

    public static void main(String[] args) {
            System.out.println("Введите слово для проверки:");
            Scanner scanner = new Scanner(System.in, "UTF-8");
            String userInput = scanner.nextLine();
            System.out.println("Является ли введенное слово палиндромом? " + isPalindrome(userInput));
            scanner.close();
        }
        public static boolean isPalindrome(String inputString) {
            if (inputString == null || inputString.isEmpty()) {
                return false;
            }

            String cleanedString = inputString.toLowerCase().replaceAll("[^а-яА-Яa-zA-Z0-9]", "");

            return IntStream.range(0, cleanedString.length() / 2)
                    .allMatch(i -> cleanedString.charAt(i) == cleanedString.charAt(cleanedString.length() - i - 1));
        }
    }
