/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */

public class Product implements IProducts {

    private int[][] sales;
    private String[] products;

    // Constructor
    public Product(int[][] sales, String[] products) {

        this.sales = sales;
        this.products = products;

    }

    // Calculate total products sold
    @Override
    public int getTotalProductsSold() {

        int total = 0;

        for (int i = 0; i < sales.length; i++) {

            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];

            }
        }

        return total;
    }

    // Calculate average products sold
    @Override
    public double getAverageProductsSold() {

        int total = getTotalProductsSold();

        int count = sales.length * sales[0].length;

        return (double) total / count;

    }

    // Determine most popular product
    @Override
    public String getMostPopularProduct() {

        int highest = 0;
        int popularIndex = 0;

        for (int i = 0; i < sales.length; i++) {

            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {

                total += sales[i][j];

            }

            if (total > highest) {

                highest = total;
                popularIndex = i;

            }
        }

        return products[popularIndex] + " (" + highest + ")";

    }
}
    

