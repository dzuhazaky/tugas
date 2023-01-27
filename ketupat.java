
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dzuhanurakbar
 */
public class ketupat {
    Scanner in = new Scanner(System.in);
    int diagonal1;
    int diagonal2;
    int sisi;

    public ketupat(){
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisi = sisi;
    }
    public void inputluas(){
        System.out.println("masukkan diagonal 1 : ");
        diagonal1 = in.nextInt();
        System.out.println("masukkan diagonal 2 : ");
        diagonal2 = in.nextInt();
    }
    public void keliling(){
        System.out.println("keliling ketupat : "+(sisi*4));
    }
    public void luas(){
        System.out.println("luas ketupat : "+0.5*diagonal1*diagonal2);
    }
    public void inputkeliling(){
        System.out.println("masukkan sisi : ");
        sisi = in.nextInt();
    }


}
