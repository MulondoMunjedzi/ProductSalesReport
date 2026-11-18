/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
import java.util.Scanner;

public class ProductSalesReport {

    public static void main(String[] args) {
      

        Scanner input = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        // Enter sales information
        for (int i = 0; i < products.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + products[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        // Create Product object
        Product product = new Product(sales, products);

        // Display report
        System.out.println("\nPRODUCT SALES REPORT - 2026");

        System.out.println("*****************");

        System.out.println("TOTAL PRODUCT SALES: " + product.getTotalProductsSold());

        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", product.getAverageProductsSold());

        System.out.println("MOST POPULAR PRODUCT: " + product.getMostPopularProduct());

        input.close();
    }
}




