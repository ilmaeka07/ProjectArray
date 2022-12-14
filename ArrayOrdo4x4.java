/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectarray;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class ArrayOrdo4x4 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        
        int matrix1[] [] = new int[4][4];
        //jumlah kurung siku untuk melihat dimensi dari array
        
        int matrix2[] [] = new int[4][4];
        
        System.out.println("Matrix 1");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
            {
                System.out.println("Masukkan isi Index ke [" + i +"][" +j +"] : ");
                matrix1[i][j] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("");
        
        System.out.println("");
        System.out.println("Matrix 2");
        
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++)
            {
                System.out.println("Masukkan isi Index ke [" + i +"][" +j +"] : ");
                matrix2[i][j] = masukan.nextInt();
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 1 ");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 2 ");
        
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
        
        
        
        System.out.println("");
        System.out.println("Penjumlahan");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] + matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Pengurangan");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] - matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
        int[][] hasilKali = new int[matrix1.length][matrix2[0].length];
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix2[0].length; j++){
                int buffer = 0;
                for (int k = 0; k < matrix1[0].length; k++){
                 buffer += matrix1[i][k] * matrix2[k][j];
                
                }  
                hasilKali[i][j] = buffer;
            }
            System.out.println("");
        }
        
        System.out.println("Perkalian");
        for (int i = 0; i < hasilKali.length; i++){
            for (int j = 0; j < hasilKali[0].length; j++)
            {
                System.out.print(hasilKali[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
