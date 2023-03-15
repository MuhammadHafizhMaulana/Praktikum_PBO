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
public class tabung extends Lingkaran implements MenghitungRuang{
    double ttabung;
    
    public tabung (double tinggi,double jari){
        super(jari);
        this.ttabung = tinggi;
    }
    

    @Override
    public double hitungVolume() {
        return phi * getJari() * getJari() * ttabung; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double itungLuasPermukaan() {
        return 2 * phi * getJari() * (ttabung + getJari()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
