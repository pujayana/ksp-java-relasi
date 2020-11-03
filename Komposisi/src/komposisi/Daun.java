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
public class Daun {
    
    private String tulangDaun;
    private String warnaDaun;
    
    public Daun(String tulangDaun, String warnaDaun){
        this.tulangDaun = tulangDaun;
        this.warnaDaun = warnaDaun;
    }
    
    public String getTulangDaun(){
        return tulangDaun;
    }
    
    public void setTulangDaun(String tulangDaun){
        this.tulangDaun = tulangDaun;
    }
    
    public String getWarnaDaun(){
        return warnaDaun;
    }
    
    public void setWarnaDaun(String warnaDaun){
        this.warnaDaun = warnaDaun;
    }
    
    public void tampilDaun(){
        System.out.println("Tulang Daun : " + getTulangDaun());
        System.out.println("Warna Daun  : " + getWarnaDaun());
    }
    
}
