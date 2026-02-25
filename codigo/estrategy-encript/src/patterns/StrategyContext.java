package patterns;

public class StrategyContext {

    private EncryptionStrategy strategy;

    public StrategyContext(EncryptionStrategy strategy) {
        setStrategy(strategy);
    }

    public byte[] encryptText(String text) {
        //El contexto delega el trabajo a la estrategia.
        byte[] result = strategy.encrypt(text);
        return result;
    }

    public String decryptText(byte[] text) {
        //El contexto delega el trabajo a la estrategia.
        String result = strategy.decrypt(text);
        return result;
    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
        this.strategy.init();
    }

}
