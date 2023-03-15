/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1pbo;

/**
 *
 * @author acer
 */
public class balok extends persegipanjang implements MenghitungRuang{
    private double tinggi;
    
    public balok (double tinggi,double panjang, double lebar){
        super(panjang,lebar);
        this.tinggi = tinggi;
    }
    
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }

    public double getTinggi(){
        return tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return super.hitungLuas() * tinggi; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double itungLuasPermukaan() {
        return 2 * (super.hitungLuas() + getPanjang() * tinggi + getLebar() * tinggi ); //To change body of generated methods, choose Tools | Templates.
    }
    
}
