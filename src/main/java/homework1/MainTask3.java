package homework1;

import java.time.LocalTime;
import java.util.Scanner;

// 3*. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
//"Доброе утро, <Имя>!", если время от 05:00 до 11:59
//"Добрый день, <Имя>!", если время от 12:00 до 17:59;
//"Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
//"Доброй ночи, <Имя>!", если время от 23:00 до 4:59


public class MainTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // запрашиваем имя пользователя
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        // получаем текущее время
        LocalTime currentTime = LocalTime.now();

        // выводим приветствие в зависимости от времени суток
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(11, 59))) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(17, 59))) {
            System.out.println("Добрый день, " + name + "!");
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(22, 59))) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
