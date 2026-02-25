/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patterns.strategy;

/**
 *
 * @author aintu
 */
public class SerieB implements Strategy {

    @Override
    public String generarSerie(int n) {
        String s = "";
        int base = 1;
        
        for (int i = 1; i <= n; i++) {
            s = s + base + " , ";
            base = base * 10;
        }
        return s;
    }
    
}




