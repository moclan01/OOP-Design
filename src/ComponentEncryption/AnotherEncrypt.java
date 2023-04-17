package ComponentEncryption;

public class AnotherEncrypt implements Encryptable{
    // đảo ngược chuõi
    @Override
    public String encrypt(String input) {
        String result = "";
        for(int i = input.length() - 1; i >= 0; i--)
            result += input.charAt(i) + "";
        return result;
    }
    
}
