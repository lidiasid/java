package exception;

import java.util.Scanner;

public class EmptyStringsMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");

        String input = scanner.nextLine();

        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя!");
            }
            System.out.println("Введенная строка: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
