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
public class Lingkaran implements MenghitungBidang{
    private double jari;
    public double phi = 3.14;
    
    public Lingkaran (double jari){
        this.jari = jari;
    
    }
    
    public void setJari(double jari){
        this.jari = jari;
    }
    
    
    double getJari(){
        return jari;
    }
    
    @Override
    public double hitungLuas() {
        return phi * jari *jari; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungKel() {
        return 2 * phi * jari;//To change body of generated methods, choose Tools | Templates.
    }

}
