/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package test.ukl;

/**
 *
 * @author dzuhanurakbar
 */
public class UKL {

    public static void main(String[] args) {
       //deret suku pertama 5,selisih 10,tampilkan 1-10
       
//        int a=2;
//        int b=10;
//        int u=a;
//        int u10=a; 
//        int n;
//        for(n=4;n<=un;n++){
//            u10=a+(b*(n-1));
//            System.out.println("Suku ke "+n+" = "+u10);
            
    //    }
        //angka ini buat dalam bentuk matrik 5 baris, 6 kolom
//        int a = 5;
//        int b = 10;
//        int u = a;
//        int s = a;
//        System.out.println("Deret Aritmatikanya adalah");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 6; j++) {
//                System.out.print(u + "\t");
//                u = u + b;
//                s = s + u;
//            }
//            System.out.println();
//        }
//        s = s - u;
//        System.out.println("Jumlah Deret Aritmatikanya adalah " + s);
//        //buatkan segitiga nomor 3
//        for (int a= 0; a<=5; a++){       
//            for (int c = 5; c > a; c--) {
//                System.out.print(" ");
//            }
//            for (int b = 1; b <= a; b++) {
//                System.out.print(b);  
//            }
//            System.out.println();         
//        }
        //6kolom,6baris
//         int a = 6;
//        int b = 10;
//        int u = a;
//        int n = a;
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < 6 - i; j++) {
//                System.out.print(u + "\t");
//                u += b;
//                n += u;
//            }
//            System.out.println("");
//        }
//        for (int i = 2; i < 7; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(u + "\t");
//                u += b;
//                n += u;
//            }
//            System.out.println("");
//       }
        //penjumlahan array no 5/6
       int matriksA [][] = {
            {6,3,2,6},
            {5,3,8,5},
            {1,2,3,4},
            {2,3,2,5},
            {4,4,5,6}
        };
        int matriksB [][] = {
            {1,3},
            {2,5},
            {3,3},
            {1,6}
        };
        int C [][] = new int [matriksA.length][matriksB[0].length];

        for (int baris = 0;baris <matriksA.length;baris++){
            for(int kolom = 0;kolom < matriksB[0].length;kolom++){
                for(int x = 0;x < matriksB.length;x++){
                    C [baris][kolom] += matriksA[baris][x]*matriksB[x][kolom];
                }
                System.out.print(C[baris][kolom]+"\t");
            }
            System.out.println();
        }
        //seleksi dsp input id siswa,pendapatan ortu, membayar berapa bulan
        
    }
}
        
        
        
    


        
    


              

