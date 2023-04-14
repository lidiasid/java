package lesson2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//2. Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
// который запишет эту строку в простой текстовый файл, обработайте исключения.

public class homeworktask2 {

    public static void main(String[] args) {
        String repeatedString = createRepeatedString("TEST", 100);

        try {
            writeStringToFile(repeatedString, "output.txt");
            System.out.println("Строка успешно записана в файл.");
        } catch (IOException e) {
            System.out.println("Ошибка при записи строки в файл: " + e.getMessage());
        }
    }

    public static String createRepeatedString(String inputString, int repetitions) {
        StringBuilder sb = new StringBuilder(inputString.length() * repetitions);
        for (int i = 0; i < repetitions; i++) {
            sb.append(inputString);
        }
        return sb.toString();
    }

    public static void writeStringToFile(String content, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }
}
