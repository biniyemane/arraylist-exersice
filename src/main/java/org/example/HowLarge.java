package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class HowLarge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        System.out.println("Enter strings (leave blank to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            items.add(input);
        }

        System.out.println("The total amount of items in the list was: " + items.size());

        scanner.close();
    }
}
