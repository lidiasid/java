package exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserInputApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lastName = "";
        String firstName = "";
        String middleName = "";
        String birthDate = "";
        long phoneNumber = 0;
        char gender = ' ';

        System.out.println("Введите фамилию:");
        lastName = scanner.nextLine();

        System.out.println("Введите имя:");
        firstName = scanner.nextLine();

        System.out.println("Введите отчество:");
        middleName = scanner.nextLine();

        while (true) {
            System.out.println("Введите дату рождения (dd.MM.yyyy):");
            String inputDate = scanner.nextLine();
            try {
                birthDate = parseDate(inputDate);
                break;
            } catch (ParseException e) {
                System.out.println("Неверный формат даты. Попробуйте еще раз.");
            }
        }

        while (true) {
            System.out.println("Введите номер телефона:");
            String inputPhoneNumber = scanner.nextLine();
            try {
                phoneNumber = parsePhoneNumber(inputPhoneNumber);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат номера телефона. Попробуйте еще раз.");
            }
        }

        while (true) {
            System.out.println("Введите пол (m или f):");
            String inputGender = scanner.nextLine();
            try {
                gender = parseGender(inputGender);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Неверный формат пола. Попробуйте еще раз.");
            }
        }

        scanner.close();

        try {
            writeToOutputFile(lastName, firstName, middleName, birthDate, phoneNumber, gender);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String parseDate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        dateFormat.parse(date);
        return date;
    }

    private static long parsePhoneNumber(String phoneNumber) throws NumberFormatException {
        return Long.parseLong(phoneNumber);
    }

    private static char parseGender(String gender) throws IllegalArgumentException {
        if (gender.length() != 1 || !(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f"))) {
            throw new IllegalArgumentException("Пол должен быть 'm' или 'f'");
        }
        return gender.charAt(0);
    }

    private static void writeToOutputFile(String lastName, String firstName, String middleName, String birthDate, long phoneNumber, char gender) throws IOException {
        File outputFile = new File(lastName + ".txt");
        if (!outputFile.exists()) {
            outputFile.createNewFile();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile, true))) {
            writer.write(String.format("%s %s %s %s %d %c", lastName, firstName, middleName, birthDate, phoneNumber, gender));
            writer.newLine();
        }
    }
}
