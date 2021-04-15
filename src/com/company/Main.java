package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static void initInventory(Inventory inventory)
    {
        LocalDate manufactureDate, expirationDate;

        // 1
        manufactureDate = LocalDate.of(2020, 3, 15);
        expirationDate = LocalDate.of(2021, 3,15);
        Product carrot = new Product("Carrot", "Vegetables", 5, 20,
                manufactureDate, expirationDate);
        inventory.add(carrot, 10);

        // 2
        manufactureDate = LocalDate.of(2020, 4, 1);
        expirationDate = LocalDate.of(2020, 8, 1);
        Product apple = new Product("Apple", "Fruits", 10, 50,
                manufactureDate, expirationDate);
        inventory.add(apple, 50);

        // 3
        manufactureDate = LocalDate.of(2020, 1, 1);
        expirationDate = LocalDate.of(2020, 6, 1);
        Product eggs = new Product("12xEggs", "Egg", 100, 40,
                manufactureDate, expirationDate);
        inventory.add(eggs, 20);

        // 4
        manufactureDate = LocalDate.of(2020, 6, 1);
        expirationDate = LocalDate.of(2021, 1, 1);
        Product oats = new Product("Oats", "Grains", 70, 100,
                manufactureDate, expirationDate);
        inventory.add(oats, 45);

        // 5
        manufactureDate = LocalDate.of(2020, 1, 1);
        expirationDate = LocalDate.of(2020, 2, 1);
        Product salmon = new Product("Salmon", "Seafood", 150, 250,
                manufactureDate, expirationDate);
        inventory.add(salmon, 5);

        // 6
        manufactureDate = LocalDate.of(2020, 3, 1);
        expirationDate = LocalDate.of(2020, 9, 1);
        Product steak = new Product("Steak", "Meat", 800, 1000,
                manufactureDate, expirationDate);
        inventory.add(steak, 5);

        // 7
        manufactureDate = LocalDate.of(2020, 1, 10);
        expirationDate = LocalDate.of(2020, 1, 25);
        Product milk = new Product("Milk", "Dairy", 100, 20,
                manufactureDate, expirationDate);
        inventory.add(milk, 20);

        // 8
        manufactureDate = LocalDate.of(2020, 2, 1);
        expirationDate = LocalDate.of(2020, 3, 15);
        Product cheese = new Product("Cheese", "Dairy", 150, 10,
                manufactureDate, expirationDate);
        inventory.add(cheese, 50);
    }
    public static void main(String[] args)
    {
        Inventory inventory = new Inventory();
        initInventory(inventory);

        // wait for the user's commands
        Scanner scanner =  new Scanner(System.in);
        String input;

        while (true)
        {
            input = scanner.nextLine();
            if (input.startsWith("add"))
            {
                // add a product using its index
            }
            else if (input.startsWith("remove"))
            {
                // remove the index
            }
            else if (input.equals("cart"))
            {
                // print all the products in the basket (JSON)
            }
            else if (input.equals("products"))
            {
                // print all the products in the inventory (JSON)
            }
            else if (input.equals("checkout"))
            {
                System.out.println("It was a pleasure doing business with you.");
                break;
            }
        }
    }
}
