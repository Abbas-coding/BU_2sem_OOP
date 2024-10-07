package com.mycompany.temperature;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int cont = 1;
       while(cont ==1){
       float F;
       int C;
        System.out.println("Enter temperature in Celcius: ");
        C = s.nextInt();
        F = (C * 9/5) + 32;
        System.out.println("The temperature in Farenheit is: " + F);
        System.out.println("Do you want continue? enter 1 to continue or 0 to exit");
        cont = s.nextInt();
        if(cont == 0)
            break;
       }
       
    }
}
