import java.util.Random;

public class UnbreakableEncryption {


    private static byte[] randomKey(int length){
        byte[] dummy = new byte[length];
        Random random = new Random();
        random.nextBytes(dummy);
        return dummy;
    }

    public static KeyPair encrypt(String original){
        byte[] originalBytes = original.getBytes();
        byte[] dummyKey = randomKey(originalBytes.length);
        byte[] encryptedKey = randomKey(originalBytes.length);
        for(int i=0;i< originalBytes.length; i++){
            encryptedKey[i] = (byte) (dummyKey[i] ^ originalBytes[i]);
        }
        return new KeyPair(dummyKey, encryptedKey);
    }

    public static String decrypt(KeyPair kp) {
        byte[] decrypted = new byte[kp.key1.length];
        for (int i = 0; i < kp.key1.length; i++) {
            decrypted[i] = (byte) (kp.key1[i] ^ kp.key2[i]);
        }
        return new String(decrypted);
    }

    public static void main(String[] args) {
        String original = "One Time Pad!";
        KeyPair kp = encrypt(original);
        String result = decrypt(kp);
        System.out.println(result);
        System.out.println(original.equalsIgnoreCase(result));
    }
}

class KeyPair {
    public final byte[] key1;
    public final byte[] key2;
    KeyPair(byte[] key1, byte[] key2){
        this.key1 = key1;
        this.key2 = key2;
    }
}