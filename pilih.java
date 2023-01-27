
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dzuhanurakbar
 */
public class pilih {
    Scanner in = new Scanner(System.in);
    
    jajargenjang jajargenjang1 = new jajargenjang();
    ketupat ketupat1 = new ketupat();
    lingkaran lingkaran1 = new lingkaran();
    persegi persegi1 = new persegi();
    segitiga segitiga1 = new segitiga();

    int pilih,pilih2;
    String ulang;

    public pilih(){
        this.jajargenjang1 = jajargenjang1;
        this.ketupat1 = ketupat1;
        this.lingkaran1 = lingkaran1;
        this.persegi1 = persegi1;
        this.pilih = pilih;
        this.pilih2 = pilih2;
        this.segitiga1 = segitiga1;
        this.ulang = ulang;
    }
    public void pilihabngun(){
        do{
            System.out.println("masukkan pilihan bangun \n1.jajar genjang \n2.belah ketupat \n3.lingkaran \n4.persegi \n5.segitiga");
        pilih = in.nextInt();
        System.out.println("pilih [1]luas / [2]keliling ");
        pilih2 = in.nextInt();
        
        switch(pilih){
            case 1 : 
                    jajargenjang1.input();

                    if(pilih2==1){
                        jajargenjang1.luas();
                    }
                    else if(pilih2==2){
                        jajargenjang1.keliling();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;
            
            case 2 : 
                    if(pilih2==1){
                        ketupat1.inputluas();
                        ketupat1.luas();
                    }
                    else if(pilih2==2){
                        ketupat1.inputkeliling();
                        ketupat1.keliling();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;

            case 3 : 
                    lingkaran1.inputlingk();
                    if(pilih2==1){
                        lingkaran1.hasilluas();
                    }
                    else if(pilih2==2){
                        lingkaran1.hasilkeliling();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;

            case 4 : 
                    persegi1.input();
                    if(pilih2==1){
                        persegi1.luasper();
                    }
                    else if (pilih2==2){
                        persegi1.kelpersegi();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;

            case 5 : 
                    segitiga1.input();
                    if(pilih2==1){
                        segitiga1.hasilluas();
                    }
                    else if (pilih2==2){
                        segitiga1.hasilkel();
                    }
                    else{
                        System.out.println("pilihan tidak tersedia");
                    }
                    break;
        }
        System.out.println("apakah anda mau mengulang [ya] / [tidak]");
        ulang = in.next();


        }
        while(ulang.equalsIgnoreCase("ya"));
        System.out.println("oke terimakasih");
        
    }
}
