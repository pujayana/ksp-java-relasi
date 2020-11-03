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
public class AsosiasiSatuArah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perusahaan p = new Perusahaan("Jaya Abadi", "Jl. Mawar 101, Yogyakarta.");
        
        Pegawai manajer, sales, supervisor;
        manajer = new Pegawai("Raymond", "Manajer", 3000000);
        sales = new Pegawai("Kristian", "Sales", 2000000);
        supervisor = new Pegawai("Eras", "Supervisor", 2500000);
        
        p.tambahPgw(manajer);
        p.tambahPgw(sales);
        p.tambahPgw(supervisor);
        p.tampilPerusahaan();
    }
    
}
