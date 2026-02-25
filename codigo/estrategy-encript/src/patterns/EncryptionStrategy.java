/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patterns;

// Estrategia
public interface EncryptionStrategy {
    byte [] encrypt (String text);
    
    String decrypt (byte [] textToDescrypt);
    
    boolean init ();
}
