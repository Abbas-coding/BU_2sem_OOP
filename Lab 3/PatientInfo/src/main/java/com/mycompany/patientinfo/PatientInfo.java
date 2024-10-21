package com.mycompany.patientinfo;
import java.util.Scanner;

public class PatientInfo {

    public static void main(String[] args) {
        Patient p1 = new Patient();
        p1.take_Patient_Data();
        p1.Print_Receipt();
    }
}

class Patient{
    int pNumber;
    String pName;
    String pEmail;
    int pAge;
    int pContact;
    String pComplain;
    int pBill;
    
    
    public void take_Patient_Data (){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Patient's Number: ");
        pNumber = s.nextInt();
        s.nextLine();
        System.out.print("Enter Patient's Name: ");
        pName = s.nextLine();
        System.out.print("Enter Patient's Email: ");
        pEmail = s.nextLine();
        System.out.println("Enter Patient's Age: ");
        pAge = s.nextInt();
        System.out.print("Enter Patient's Contact: ");
        pContact = s.nextInt();
        s.nextLine();
        System.out.print("Enter Patient's Complain: ");
        pComplain = s.nextLine();
        System.out.print("Enter Patient's Bill: ");
        pBill = s.nextInt();  
    }
    public void Print_Receipt(){
        System.out.println("---------Patient's Receipt-------");
        System.out.println("Patient's Number: " + pNumber);
        System.out.println("Patient's Name: " + pName);
        System.out.println("Patient's Age: " + pAge);
        System.out.println("Patient's Email: " + pEmail);
        System.out.println("Patient's Contact: " + pContact);
        System.out.println("Patient's Complain: " + pComplain);
        System.out.println("Patient's Bill: " + pBill);
        
    }
    
}