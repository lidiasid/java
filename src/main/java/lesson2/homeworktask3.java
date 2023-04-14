package lesson2;

import java.io.File;
import java.io.IOException;

//3*.Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида:

public class homeworktask3 {

    public static void main(String[] args) {
        try {
            listFileExtensions();
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файлов: " + e.getMessage());
        }
    }

    public static void listFileExtensions() throws IOException {
        File currentDirectory = new File(".").getCanonicalFile();
        File[] files = currentDirectory.listFiles();

        if (files != null) {
            int fileCounter = 1;
            for (File file : files) {
                if (file.isFile()) {
                    String fileName = file.getName();
                    int dotIndex = fileName.lastIndexOf('.');
                    String fileExtension = dotIndex > 0 ? fileName.substring(dotIndex + 1) : "";
                    System.out.println(fileCounter + " Расширение файла: " + fileExtension);
                    fileCounter++;
                }
            }
        } else {
            System.out.println("Не удалось получить список файлов в текущей папке.");
        }
    }
}

