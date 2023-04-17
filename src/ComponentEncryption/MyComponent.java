package ComponentEncryption;

import java.util.ArrayList;
import java.util.List;

public class MyComponent implements Component {
    private String data;
    private String result;
    private List<Encryptable> encrypts;

    public MyComponent(){
        this.encrypts = new ArrayList<Encryptable>();
    }

    public void setEncryptComponent(Encryptable ... encrypts) {
        this.encrypts = new ArrayList<Encryptable>();
        for (Encryptable encrypt : encrypts) {
            this.encrypts.add(encrypt);
        }
    }

    @Override
    public void input(String data) {
        this.data = data;
    }

    @Override
    public void process() {
       if(data == null) {
        throw new IllegalStateException("Input data is null");
       }
       result = data.trim();
       if(data != null){
        for (Encryptable encrypt : encrypts) {
            result = encrypt.encrypt(data);
        }
       }
    }

    @Override
    public String getResult() {
        return result;
    }

}
