package com.mycompany.sum;
import java.util.Scanner;

public class Sum {

    static int sum = 0;
    static int sum1 =0;
    public static int computeOddSum(int i){
        
        if(i <= 0 ){
            return sum;
        }
        else if(i% 2 == 1){
            sum = sum + i;
            return computeOddSum(i-2);
        }
        else if(i% 2== 0){
            sum = i-1;
            return computeOddSum(i-3);
        }
        return sum;
    }
    
    public static int computeEvenSum(int i){
        
        if(i <= 0 ){
            return sum1;
        }
        else if(i% 2 == 1){
            sum1 = i-1;
            return computeEvenSum(i-3);
        }
        else if(i% 2== 0){
            sum1 = sum1 + i;
            return computeEvenSum(i-2);
        }
        return sum1;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inp = s.nextInt();
        int result= computeOddSum(inp);
        System.out.println("result " + result);
        
        int inp1 = s.nextInt();
        int result1= computeEvenSum(inp1);
        System.out.println("result " + result1);
    }
}
