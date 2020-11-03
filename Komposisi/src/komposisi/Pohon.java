/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package komposisi;

/**
 *
 * @author pujayana
 */
public class Pohon {
    
    private String namaPohon;
    private float tinggiPohon;
    private Daun daun;
    
    public Pohon(String namaPohon, float tinggiPohon, String tulangDaun, String warnaDaun){
        this.namaPohon = namaPohon;
        this.tinggiPohon = tinggiPohon;
        this.daun = new Daun(tulangDaun, warnaDaun);
    }
    
    public String getNamaPohon(){
        return namaPohon;
    }
    
    public void setNamaPohon(String namaPohon){
        this.namaPohon = namaPohon;
    }
    
    public float getTinggiPohon(){
        return tinggiPohon;
    }
    
    public void setTinggiPohon(float tinggiPohon){
        this.tinggiPohon = tinggiPohon;
    }
    
    public void tampilPohon(){
        System.out.println("Pohon "+getNamaPohon());
        System.out.println("Tinggi      : "+getTinggiPohon()+"cm");
        daun.tampilDaun();
    }
    
    
}
