/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class RunApplication {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select console type: 1. PS5 2. XBOX 3. SWITCH");
        System.out.print("Enter choice (1-3): ");
        int choice = sc.nextInt();
        sc.nextLine(); // Implementing the enter

        String consoleType = "";
        switch(choice) {
            case 1: consoleType = "PS5"; break;
            case 2: consoleType = "XBOX"; break;
            case 3: consoleType = "SWITCH"; break;
            default: consoleType = "PS5";
        }

        System.out.print("Enter store name: ");
        String storeName = sc.nextLine();

        System.out.print("Enter total amount of sales: ");
        int totalSales = sc.nextInt();

        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);
        sale.printReport();
    }
}