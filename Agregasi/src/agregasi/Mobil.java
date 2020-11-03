/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregasi;

/**
 *
 * @author pujayana
 */
public class Mobil {
    
    private String merk;
    private float harga;
    private Engine mesin;
    
    public Mobil(String merk, float harga, Engine mesin){
        this.merk = merk;
        this.harga = harga;
        this.mesin = mesin;
    }
    
    public String getMerk(){
        return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
    }
    
    public float getHarga(){
        return harga;
    }
    
    public void setHarga(float harga){
        this.harga = harga;
    }
    
    public float hitungPajak(float harga){
        return (float)(harga * 0.1);
    }
    
    public void displayMobil(){
        System.out.println("Mobil "+getMerk());
        System.out.println("Harga   : "+getHarga());
        System.out.println("Pajak   : "+hitungPajak(harga));
        mesin.displayEngine();
    }
    
}
