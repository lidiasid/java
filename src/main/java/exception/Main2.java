package exception;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Main2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5,};
        int[] array2 = {5, 4, 3, 2, 1};

        int[] result = findDifference(array1, array2);
        if (result != null) {
            System.out.println("Разность элементов массивов:");
            for (int element : result) {
                System.out.print(element + " ");
            }
        }
    }

    public static int[] findDifference(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            System.out.println("Длины массивов не равны. Невозможно вычислить разность.");
            return null;
        }

        int[] differenceArray = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            differenceArray[i] = array1[i] - array2[i];
        }
        return differenceArray;
    }
}


// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?

// public static int sum2d(String[][]arr){
//    int sum = 0;
//    for (int i = 0; i < arr.length; i++){
//        for (int j = 0; j < 5; j++){
//            int val = Integer.parseInt(arr[i][j]);
//            sum += val;
//        }
//    }
//}

// Исключения:

//NullPointerException: Если входной массив arr или один из его элементов равен null, то будет выброшено исключение.

//IndexOutOfBoundsException: Если размер вложенных массивов меньше 5,
// то при попытке обратиться к элементу с индексом 5 будет выброшено исключение.

//NumberFormatException: Если один из элементов массива arr содержит строку, которую нельзя преобразовать в целое число,
// Integer.parseInt() выбросит исключение.