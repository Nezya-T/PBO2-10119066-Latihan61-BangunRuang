/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10119066.latihan61.bangunruang;

/**
 *
 * @author Neyza-T
 */
public abstract class Kerucut extends BangunRuang{
        
    private double r;
    
    public Kerucut(double r){
        this.r = r;
    }
    
    @Override
    public double hitungVolume(){
        return 0.333333 * 3.14 * r * r * 9;
    }
}
