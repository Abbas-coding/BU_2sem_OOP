package com.mycompany.matrix;
import java.util.Scanner;

public class Matrix {
    
    public static void main(String[] args) {
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
        
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter value for Matrix 1");
        for(int i =0; i < 3; i++){
            System.out.println("Enter value for Matrix 1, row: "+ (i+1));
            for(int j = 0; j < 3; j++){
                mat1[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Enter value for Matrix 2");
        for(int i =0; i < 3; i++){
            System.out.println("Enter value for Matrix 2, row: "+ (i+1));
            for(int j = 0; j < 3; j++){
                
                mat2[i][j] = s.nextInt();
            }
        }
        
        System.out.println("Matrix 1: ");
        for(int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(mat1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        System.out.println("Matrix 2:");
        for(int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(mat2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        // For Equation 1 (Mat_1^3) + (Mat_2)^2
        int[][] temp1 = new int[3][3];
        int[][] temp2 = new int[3][3];
        
        
        for(int j = 0; j < 3; j++){ // for row of first matrix 
            for(int k = 0; k < 3; k++){ // for column of second matrix
                for(int l = 0; l < 3; l++){  //for rotating values
                    temp1[j][k] += mat1[j][l] * mat1[l][k];
                }
            }
        }
        
        for(int j = 0; j < 3; j++){ // for row of first matrix 
            for(int k = 0; k < 3; k++){ // for column of second matrix
                for(int l = 0; l < 3; l++){  //for rotating values
                    temp2[j][k] += temp1[j][l] * mat1[l][k];
                }
            }
        }
        
//        System.out.println("Matrix 1 cube: ");
//        for(int i =0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.print(temp2[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
        
        int[][] temp3 = new int[3][3];
        
        for(int j = 0; j < 3; j++){ // for row of first matrix 
            for(int k = 0; k < 3; k++){ // for column of second matrix
                for(int l = 0; l < 3; l++){  //for rotating values
                    temp3[j][k] += mat2[j][l] * mat2[l][k];
                }
            }
        }
        
//        System.out.println("Matrix 2 sqaure: ");
//        for(int i =0; i < 3; i++){
//            for(int j = 0; j < 3; j++){
//                System.out.print(temp3[i][j]);
//                System.out.print(" ");
//            }
//            System.out.println("");
//        }
        
        int[][] result = new int[3][3];
        
        for (int i =0 ; i < 3; i++){
            for( int j = 0 ; j < 3; j++)
                result[i][j] = temp2[i][j] + temp3[i][j];
        }
        
        System.out.println("Resultant Matrix for Equation 1 : "); // Equation One Completed
        for(int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(result[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        
        // Equation Two (Mat_2 -3)^2
        int[][] temp4 = new int[3][3];
        int[][] result2 = new int[3][3];
        
        for (int i =0 ; i < 3; i++){
            for( int j = 0 ; j < 3; j++)
                temp4[i][j] = mat2[i][j] -3;
        }
        
        for(int j = 0; j < 3; j++){ // for row of first matrix 
            for(int k = 0; k < 3; k++){ // for column of second matrix
                for(int l = 0; l < 3; l++){  //for rotating values
                    result2[j][k] += temp4[j][l] * temp4[l][k];
                }
            }
        }
        
        System.out.println("Resultant Matrix for Equation 2 : "); // Equation Two Completed
        for(int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(result2[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        //Equation 3 (Mat_2^5) – (Mat_1-2)
        int[][] temp5 = new int[3][3];
        for (int i =0 ; i < 3; i++){
            for( int j = 0 ; j < 3; j++)
                temp5[i][j] = mat1[i][j] -2;
        }
        
         // temp 3 is matrix 2 (squared)
         int[][] temp6 = new int[3][3];
         int[][] temp7 = new int[3][3];
         int[][] temp8 = new int[3][3];
         int[][] result3 = new int[3][3];
        
         //power 3
        for(int j = 0; j < 3; j++){ // for row of first matrix 
            for(int k = 0; k < 3; k++){ // for column of second matrix
                for(int l = 0; l < 3; l++){  //for rotating values
                    temp6[j][k] += temp3[j][l] * mat2[l][k];
                }
            }
        }
        
        //power 4
        for(int j = 0; j < 3; j++){ // for row of first matrix 
            for(int k = 0; k < 3; k++){ // for column of second matrix
                for(int l = 0; l < 3; l++){  //for rotating values
                    temp7[j][k] += temp6[j][l] * mat2[l][k];
                }
            }
        }
        // power 5
        for(int j = 0; j < 3; j++){ // for row of first matrix 
            for(int k = 0; k < 3; k++){ // for column of second matrix
                for(int l = 0; l < 3; l++){  //for rotating values
                    temp8[j][k] += temp7[j][l] * mat2[l][k];
                }
            }
        }
        
        for (int i =0 ; i < 3; i++){
            for( int j = 0 ; j < 3; j++)
                result3[i][j] = temp8[i][j] - temp5[i][j];
        }
        
        System.out.println("Resultant Matrix for Equation 3 : "); // Equation Three Completed
        for(int i =0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(result3[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        
    }
}
