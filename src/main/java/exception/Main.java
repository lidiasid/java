package exception;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

public class Main {
    public static void causeArithmeticException() {
        int a = 10;
        int b = 0;
        int result = a / b;  // Деление на ноль вызовет исключение ArithmeticException
    }
    public static void causeNullPointerException() {
        String nullString = null;
        int stringLength = nullString.length();  // Вызов .length() для null-ссылки вызовет исключение NullPointerException
    }
    public static void causeArrayIndexOutOfBoundsException() {
        int[] array = new int[5];
        int outOfBoundsValue = array[10];  // Обращение к недопустимому индексу вызовет исключение ArrayIndexOutOfBoundsException
    }
    public static void main(String[] args) {
        try {
            causeArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Поймано исключение ArithmeticException: " + e.getMessage());
        }

        try {
            causeNullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Поймано исключение NullPointerException: " + e.getMessage());
        }

        try {
            causeArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключение ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

}

