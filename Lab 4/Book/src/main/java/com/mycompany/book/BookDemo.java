package com.mycompany.book;
import java.util.Scanner;
public class BookDemo {
    public static void main(String[] args){
        Book book1 = new Book("Developing Java Software", "Russel Winder", 79.75);
        String details = book1.toString();
        System.out.println(details);
    }
}
