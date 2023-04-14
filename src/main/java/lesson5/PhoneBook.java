package lesson5;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    private HashMap<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addPhoneNumber(String name, String phoneNumber) {
        ArrayList<String> phoneNumbers;
        if (phoneBook.containsKey(name)) {
            phoneNumbers = phoneBook.get(name);
        } else {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(phoneNumber);
        phoneBook.put(name, phoneNumbers);
    }

    public ArrayList<String> getPhoneNumbers(String name) {
        return phoneBook.getOrDefault(name, new ArrayList<>());
    }

    public void printAllEntries() {
        for (String name : phoneBook.keySet()) {
            System.out.println(name + ": " + phoneBook.get(name));
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhoneNumber("Anna", "6784563498");
        phoneBook.addPhoneNumber("Anna", "6751213005");
        phoneBook.addPhoneNumber("Vadim", "1230984576");
        phoneBook.addPhoneNumber("Svetlana", "4963752633");

        phoneBook.printAllEntries();
    }
}
