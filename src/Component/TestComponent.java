package Component;

public class TestComponent {
    public static void main(String[] args) {
        Component textComponent = new TextComponent("0838182039");
        textComponent.setComponentTypes(new PhoneValidation());
        textComponent.validate();

        Component email = new TextComponent("21130207@st.hcmuaf.edu.vn");
        email.setComponentTypes(new EmailValidation());
        email.validate();

        Component length = new TextComponent("21130207@st.hcmuaf.edu.vn");
        length.setComponentTypes(new MinMaxLengthValidation(10,700));
        length.validate();

    }
}
