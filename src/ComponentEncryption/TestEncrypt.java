package ComponentEncryption;

public class TestEncrypt {
    public static void main(String[] args) {
        Component component1 = new MyComponent();
        Component component2 = new MyComponent();
        component1.setEncryptComponent(new CaesarCipherEncrypt());
        component2.setEncryptComponent(new AnotherEncrypt());

        component1.input("I'm a student");
        component2.input("I'm a student");
        component1.process();
        component2.process();
        System.out.println(component1.getResult());
        System.out.println("------------------");
        System.out.println(component2.getResult());
    }
}
