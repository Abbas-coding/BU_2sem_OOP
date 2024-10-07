package com.mycompany.arithmatic;
import java.util.Scanner;
public class Arithmatic {

    public static void main(String[] args) {
        int sum , diff, product;
        Scanner s= new Scanner(System.in);
        int cont = 1;
        while(cont == 1){
        System.out.println("Enter two Numbers: ");
        int x = s.nextInt();
        int y = s.nextInt();
        
        sum = x +y ;
        diff = x - y ;
        product = x * y;
        
        System.out.println("sum : " + sum);
        System.out.println("difference: " +diff);
        System.out.println("product: " + product);
        
        System.out.println("Do you want to continue? 0 to quit, 1 to continue: ");
        cont = s.nextInt();
        if(cont == 0){
            break;
        }
        }
    }
}
