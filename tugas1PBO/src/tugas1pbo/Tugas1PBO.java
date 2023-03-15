/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Tugas1PBO {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herez
        Scanner input = new Scanner(System.in);
                
        int pilih;
        String ulang;
           
        
        do{
        System.out.println("Pilih Menu : ");
        System.out.println("1. Persegi dan Balok");
        System.out.println("2. Lingkaran dan Tabung");
        System.out.print("Pilih : ");
        

        pilih = input.nextInt();
        
        switch(pilih){
            case 1 : 
                System.out.println("Persegi dan Balok");
                System.out.print("Masukkan Panjang  : ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan Lebar  : ");
                double lebar = input.nextDouble();
                System.out.print("Masukkan Tinggi  : ");
                double tinggi = input.nextDouble();
                
                persegipanjang persegip = new persegipanjang(panjang, lebar);
                balok blk = new balok (tinggi,panjang,lebar);
                
                System.out.println("Luas Persegi Panjang      = " + persegip.hitungLuas());
                System.out.println("Keliling Persegi Panjang  = " + persegip.hitungKel());
                System.out.println("Volume Balok              = " + blk.hitungVolume());
                System.out.println("Luas Permukaan Balok      = " + blk.itungLuasPermukaan());
            break;
            case 2 :
                System.out.println("Lingkaran dan Tabung");
                System.out.print("Masukkan Jari - Jari  : ");
                double jari = input.nextDouble();
                System.out.print("Masukkan tinggi  : ");
                double ttabung = input.nextDouble();
                
                Lingkaran lingkaran = new Lingkaran (jari);
                tabung tabung = new tabung (jari,ttabung);
                
                System.out.println("Luas Lingkaran        : " + lingkaran.hitungLuas());
                System.out.println("Keliling Lingkaran    : " + lingkaran.hitungKel());
                System.out.println("Volume Tabung         : " + lingkaran.hitungLuas());
                System.out.println("Luas Permukaan Tabung : " + lingkaran.hitungKel());
             break;
            default :
                System.out.println("Angka yang dimasukkan salah");
            break;
        }
        input.nextLine();
        System.out.println("Pilih Ulang (y/n): ");            
        ulang = input.nextLine();   
        }while (ulang.equalsIgnoreCase("y"));
        
      
    }
    
}
