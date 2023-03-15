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
public class persegipanjang implements MenghitungBidang{
    
    private double panjang,lebar;
    
    public persegipanjang(double panjang,double lebar){
        this.lebar = lebar;
        this.panjang = panjang;        
    
    }
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    
    public double getPanjang(){
        return panjang;
    }

    public double getLebar(){
        return lebar;
    }
    
    
    @Override
    public double hitungLuas() {
        return panjang * lebar; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double hitungKel() {
        return 2*(panjang + lebar); //To change body of generated methods, choose Tools | Templates.
    }
    
}
