package lesson5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW5Task2 {

    public static void main(String[] args) {
        String[] names = {
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        };

        HashMap<String, Integer> nameCount = new HashMap<>();

        for (String fullName : names) {
            String firstName = fullName.split(" ")[0];
            nameCount.put(firstName, nameCount.getOrDefault(firstName, 0) + 1);
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(nameCount.entrySet());
        entries.sort(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

