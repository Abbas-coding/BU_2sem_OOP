package com.mycompany.cookies;
import java.util.Scanner;
public class Cookies {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int cookies, boxes, cartons, leftOvers;
        float total;
        cookies = s.nextInt();
        if(cookies <= 0)
            System.out.println("Give a higher count");
        else{
            boxes = cookies / 12;
            cartons = boxes / 24;
        }
        
    }
}
