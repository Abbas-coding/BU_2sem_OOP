package com.mycompany.product;
import java.util.Scanner;

public class Product {

    static int product(int x){
    if(x ==0){
        return 1;
    }
    else{
        return x * product(x-1);
    }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a Number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long result = product(a);
        System.out.println("Result: " + result);
    }
}
