/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1electronics;

/**
 *
 * @author Student
 */
public class Number1ElectronicsReport {
    public static void main(String[] args) {

        // 1. Single dimensional arrays
        
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // 2. Two dimensional array for sales
        
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200} // Pretoria
        };

        int[] totalPerCity = new int[3];
        int maxSales = 0;
        int maxCityIndex = 0;

        // Calculated totals
        
        for (int i = 0; i < cities.length; i++) {
            int total = 0;
            for (int j = 0; j < consoles.length; j++) {
                total += sales[i][j];
            }
            totalPerCity[i] = total;
            if (total > maxSales) {
                maxSales = total;
                maxCityIndex = i;
            }
        }

        // Report - This is the same as sample screenshot
        
        System.out.println("========================================================");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("========================================================");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "", "PS5", "XBOX", "SWITCH");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d\n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d\n", cities[i], totalPerCity[i]);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxCityIndex]);
        System.out.println("========================================================");
    }
}