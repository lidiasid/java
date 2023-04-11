package lesson6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaptopStore {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Apple", "MacBook Pro", "Silver", 16, 13.3));
        laptops.add(new Laptop("Dell", "XPS 15", "Black", 32, 15.6));
        laptops.add(new Laptop("HP", "Envy 13", "Silver", 8, 13.3));
        laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", "Black", 16, 14.0));
        laptops.add(new Laptop("Asus", "ZenBook 14", "Blue", 8, 14.0));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum RAM size:");
        int minRamSize = scanner.nextInt();

        System.out.println("Enter the desired color:");
        String desiredColor = scanner.next();

        List<Laptop> filteredLaptops = new ArrayList<>();
        for (Laptop laptop : laptops) {
            if (laptop.getRamSize() >= minRamSize && laptop.getColor().equalsIgnoreCase(desiredColor)) {
                filteredLaptops.add(laptop);
            }
        }

        System.out.println("Laptops matching the criteria:");
        for (Laptop laptop : filteredLaptops) {
            System.out.println(laptop);
        }
    }
}

