/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Meowity
 */
public class Product {

    //the file of class has to be named the same name as the class. 
    //e.g. Product class -> Product.java
    
    private String productName;
    private double productPrice;
    private int productAmount;

public Product(String pName, double pPrice, int pAmount) {
    // this is the constructor
    //notice that this is within the class bracket
        this.productName = pName;
        this.productPrice = pPrice;
        this.productAmount= pAmount;
        
        
    }
public void printProduct() {
    //notice that the method is outside the class bracker
    System.out.println(productName + ", price " + productPrice + ", amount " + productAmount);
    
}
}
