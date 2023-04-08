package lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class HomeWork4Task1 {
    public static void main(String[] args) {
        LinkedList<String> inputList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку или команду (print, revert, exit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("print")) {
                if (!inputList.isEmpty()) {
                    System.out.println(inputList.getLast());
                    for (int i = 1; i < inputList.size() - 1; i++) {
                        System.out.println(inputList.get(i));
                    }
                    if (inputList.size() > 1) {
                        System.out.println(inputList.getFirst());
                    }
                } else {
                    System.out.println("Список пуст.");
                }
            } else if (input.equalsIgnoreCase("revert")) {
                if (!inputList.isEmpty()) {
                    inputList.removeLast();
                    System.out.println("Последняя введенная строка удалена.");
                    System.out.println("Текущий список строк:");
                    if (!inputList.isEmpty()) {
                        System.out.println(inputList.getFirst());
                        for (int i = 1; i < inputList.size() - 1; i++) {
                            System.out.println(inputList.get(i));
                        }
                        if (inputList.size() > 1) {
                            System.out.println(inputList.getLast());
                        }
                    } else {
                        System.out.println("Список пуст.");
                    }
                } else {
                    System.out.println("Список пуст.");
                }
            } else if (input.equalsIgnoreCase("exit")) {
                System.out.println("Завершение программы.");
                break;
            } else {
                inputList.add(input);
            }
        }

        scanner.close();
    }
}
