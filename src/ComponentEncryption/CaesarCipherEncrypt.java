package ComponentEncryption;

public class CaesarCipherEncrypt implements Encryptable{
    // tăng vị trí của kí tự + 2
    @Override
    public String encrypt(String input) {
        String result = "";
        for(char c : input.toCharArray())
            if(Character.toUpperCase(c) == c )
                result += (char)('A' + (c  - 65 + 2) % 26);
            else result += (char)('a' + (c  - 97 + 2) % 26);
        return result;
    }
    
}
