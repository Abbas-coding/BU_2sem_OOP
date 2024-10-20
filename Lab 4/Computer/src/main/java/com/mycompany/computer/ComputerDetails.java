package com.mycompany.computer;
import java.util.Scanner;

public class ComputerDetails {
    private String name;
    private String type;
    private String proc;
    private int ram;
    private int hdd;
    private String mdd;
    private String opd;
    
//    ComputerDetails(String name, String type, String proc, int ram, int hdd, String mdd, String opd){
//        this.name = name;
//        this.type = type;
//        this.proc = proc;
//        this.ram = ram;
//        this.hdd = hdd;
//        this.mdd = mdd;
//        this.opd = opd;
//    }
    
    void getInfo(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Computer Details: ");
        System.out.print("Name : ");
        this.name = s.next();
        System.out.print("Type: ");
        this.type = s.next();
        System.out.print("Processor: ");
        this.proc = s.next();
        System.out.print("Ram (In GB): ");
        this.ram = s.nextInt();
        System.out.print("Hard Disk (In in GB): ");
        this.hdd= s.nextInt();
        System.out.print("Motherboard: ");
        this.mdd= s.next();
        System.out.print("Optical Drive: ");
        this.opd = s.next();
        
    }
    
    void display(){
        Scanner s = new Scanner(System.in);
        System.out.println("Computer Details: ");
        System.out.println("Name : " + this.name);
        System.out.println("Type: "+ this.type);
        System.out.println("Processor: " + this.proc);
        System.out.println("Ram (In GB): "+ this.ram);
        System.out.println("Hard Disk (In in GB): "+ this.hdd);
        System.out.println("Motherboard: " + this.mdd);
        System.out.println("Optical Drive: " + this.opd);
        
    }
    
    void update(){
        System.out.println("\nSelect the field you want to update: ");
        System.out.print("1. Name: \n2. Type \n3. Processor \n4. Ram \n5. Hard Disk \n6. Motherboard\n7. Optical Drive\n");
        Scanner s = new Scanner(System.in);
        int sel = s.nextInt();
        switch (sel) {
            case 1:
                System.out.print("Enter the new value: ");
                this.name = s.next();
                break;
            case 2:
                System.out.print("Enter the new value: ");
                this.type = s.next();
                break;
            case 3:
                System.out.print("Enter the new value: ");
                this.proc = s.next();
                break;
            case 4:
                System.out.print("Enter the new value: ");
                this.ram = s.nextInt();
                break;
            case 5:
                System.out.print("Enter the new value: ");
                this.hdd = s.nextInt();
                break;
            case 6:
                System.out.print("Enter the new value: ");
                this.mdd = s.next();
                break;
            case 7:
                System.out.print("Enter the new value: ");
                this.opd = s.next();
                break;
            default:
                throw new AssertionError();
        }
        
        display();
    }
    
}
