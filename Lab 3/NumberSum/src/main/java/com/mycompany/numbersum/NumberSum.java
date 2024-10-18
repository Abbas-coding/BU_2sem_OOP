package com.mycompany.numbersum;
import java.util.Scanner;

public class NumberSum {

    static int numberSum(int x, int y){
        if(y<1x){
           return 0; 
        }
        else{
            return y + numberSum(x, y-1);
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Enter two numbers for sum (1st < 2nd): ");
        int a,b;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        int result = numberSum(a,b);
        System.out.println("Result: " + result);
    }
}
