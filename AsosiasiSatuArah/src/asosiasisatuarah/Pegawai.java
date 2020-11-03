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
public class Pegawai {
    private String nama, jabatan;
    private float gaji;

    public Pegawai(String nama, String jabatan, float gaji){
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public float getGaji(){
        return gaji;
    }
    
    public void setGaji(float gaji){
        this.gaji = gaji;
    }
    
    public void tampilData(){
        System.out.println("\tNama : "+getNama()+
                            "\n\tJabatan : "+getJabatan()+
                            "\n\tGaji    : "+getGaji());
    }
}
