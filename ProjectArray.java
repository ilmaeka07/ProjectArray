/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectarray;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class ProjectArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        --Cara Pertama--
//        String[] bunga = null;
//        bunga[0] = "Mawar";
//        bunga[1] = "Melati";
//        bunga[2] = "Matahari";
//            System.out.println(bunga[0]);
//            
////        --Cara Kedua--
//        int usia[] = {18, 19, 20, 21};
                
//        --Cara ketiga--
//        String[] bunga = new String[2];
//        bunga[0] = "Mawar";
//        bunga[1] = "Melati";
//        bunga[2] = "Matahari";
//            System.out.println(bunga[2]);
            
            
//        --Menggunakan Perulangan--
//        String[] nama = {"Ilma", "Alpi", "Dito"};
//        int usia[] = {18, 19, 20};
//        String[] alamat = new String[3];
//        alamat[0] = "Bondowoso";
//        alamat[1] = "Magetan";
//        alamat[2] = "Jember";
//        
//        for (int item = 0; item < nama.length; item++) {
//            System.out.println("Nama Saya = " + nama[item] + "\n"
//                               + "Usia = " + usia[item] + " " + "Alamat = " + alamat[item]); 
//        }
//        for (String i : nama) {
//            System.out.println("Namaku = " + i + " ");
//        }
//          --Array List--
        ArrayList biodata = new ArrayList();
        biodata.add("Ilma");
        biodata.add(18);
        biodata.add("Bondowoso");
        biodata.add("Alpi");
        biodata.add(18);
        biodata.add("Magetan");
        biodata.add("Dito");
        biodata.add(20);
        biodata.add("Jember");
        biodata.remove("21");
        
            System.out.println(biodata);
            System.out.println("Jumlah Data " + biodata.size());
            System.out.println(biodata.get(2));
    }
    
}
