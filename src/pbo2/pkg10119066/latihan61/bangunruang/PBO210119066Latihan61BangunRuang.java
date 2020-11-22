/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan61.bangunruang;

/**
 *
 * @author Neyza-T
 * Nama     : Nezya Tariska
 * Kelas    : IF2
 * Nim      : 10119066
 */
public class PBO210119066Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BangunRuang obyek1 = new Bola(7){
        };
        System.out.println("V = " + obyek1.hitungVolume());
        
        BangunRuang obyek2 = new Tabung(10){
        };
        System.out.println("V = " + obyek2.hitungVolume());
        
        BangunRuang obyek3 = new Kerucut(14){
        };
        System.out.println("V = " + obyek3.hitungVolume());
    }
    
}
