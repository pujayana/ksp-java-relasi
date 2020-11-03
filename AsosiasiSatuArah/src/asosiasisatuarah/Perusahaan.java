/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asosiasisatuarah;

/**
 *
 * @author pujayana
 */

import java.util.Vector;
public class Perusahaan {
    private String namaPerusahaan, alamat;
    private Vector<Pegawai> daftarPgw;
    
    public Perusahaan(String namaPerusahaan, String alamat){
        this.namaPerusahaan = namaPerusahaan;
        this.alamat = alamat;
        this.daftarPgw = new Vector<Pegawai>();
    }
    
    public String getNamaPerusahaan(){
        return namaPerusahaan;
    }
    
    public void setNamaPerusahaan(String namaPerusahaan){
        this.namaPerusahaan = namaPerusahaan;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public void tambahPgw(Pegawai p){
        daftarPgw.addElement(p);
    }
    
    public void tampilPerusahaan(){
        System.out.println(getNamaPerusahaan()+"\n"+getAlamat());
        for(int i=0; i<daftarPgw.size(); i++){
            daftarPgw.elementAt(i).tampilData();
        }
    }
}
