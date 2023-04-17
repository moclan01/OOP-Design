package ComponentEncryption;

public interface Component {
    public void input(String data);
    public void process();
    public void setEncryptComponent(Encryptable ... encrypts);
    public String getResult();
}
