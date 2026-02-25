
package patterns;

public class StrategyClient {
    public static void main(String[] args) {
        
        String originalText = "Los patrones son geniales";
        
        EncryptionStrategy strategy = new CaesarStrategy();
        StrategyContext context = new StrategyContext (strategy);
        
        byte[] encrypted = context.encryptText(originalText);
        String decypted = context.decryptText(encrypted);
        
        System.out.println("Cesar: " + originalText);
        System.out.println("Cesar: " + decypted);
        
        strategy = new AESStrategy();
        context.setStrategy(strategy);
        
        encrypted = context.encryptText(originalText);
        decypted = context.decryptText(encrypted);
        
        System.out.println("AES: " + originalText);
        System.out.println("AES: " + decypted);
    }
}
