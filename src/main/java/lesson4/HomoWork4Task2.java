package lesson4;

import java.util.LinkedList;
import java.util.ListIterator;

public class HomoWork4Task2 {
    public static void main(String[] args) {
        LinkedList<Object> originalList = new LinkedList<>();
        originalList.add(9);
        originalList.add("Banana");
        originalList.add(3);
        originalList.add("Task");
        originalList.add(1);

        System.out.println("Оригинальный список: " + originalList);
        LinkedList<Object> reversedList = reverseLinkedList(originalList);
        System.out.println("Перевернутый список: " + reversedList);
    }

    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> originalList) {
        LinkedList<T> reversedList = new LinkedList<>();
        ListIterator<T> iterator = originalList.listIterator(originalList.size());
        while (iterator.hasPrevious()) {
            reversedList.add(iterator.previous());
        }
        return reversedList;
    }
}
