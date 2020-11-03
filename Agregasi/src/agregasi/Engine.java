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
public class Engine {
    
    private int cc;
    private float torsi;
    
    public Engine(int cc, float torsi){
        this.cc = cc;
        this.torsi = torsi;
    }
    
    public int getCc(){
        return cc;
    }
    
    public void setCc(int cc){
        this.cc = cc;
    }
    
    public float getTorsi(){
        return torsi;
    }
    
    public void setTorsi(float torsi){
        this.torsi = torsi;
    }
    
    public void displayEngine(){
        System.out.println("Spesifikasi Mesin");
        System.out.println("CC      : " + getCc());
        System.out.println("Torsi   : " + getTorsi());
    }
    
}
