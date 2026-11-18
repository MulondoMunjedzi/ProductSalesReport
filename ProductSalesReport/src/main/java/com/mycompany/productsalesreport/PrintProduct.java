/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalesreport;

/**
 *
 * @author Student
 */
public class PrintProduct {
    

    // Print total products sold
    public void printTotalProductSales(Product product) {

        System.out.println("TOTAL PRODUCT SALES: "
                + product.getTotalProductsSold());

    }

    // Print average products sold
    public void printAverageProductSales(Product product) {

        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",
                product.getAverageProductsSold());

    }

    // Print most popular product
    public void printMostPopularProduct(Product product) {

        System.out.println("MOST POPULAR PRODUCT: "
                + product.getMostPopularProduct());

    }

}
    

