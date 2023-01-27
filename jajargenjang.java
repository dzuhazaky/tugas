
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dzuhanurakbar
 */
public class jajargenjang {
     Scanner in = new Scanner(System.in);
    int alas;
    int tinggi;

    public jajargenjang(){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void luas(){
        System.out.println("luas jajar genjang : "+(alas*tinggi));
    }
    public void keliling(){
        System.out.println("keliling jajar genjang : "+2*(alas+tinggi));
    }
    public void input(){
        System.out.println("masukkan alas : ");
        alas = in.nextInt();
        System.out.println("masukkan tinggi : ");
        tinggi = in.nextInt();

    }

}
