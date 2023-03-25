package homework1;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 3, 9, 1};

        // инициализируем минимальный и максимальный элементы массива
        int min = arr[0];
        int max = arr[0];

        // находим минимальный и максимальный элементы массива
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}





