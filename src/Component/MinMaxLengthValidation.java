package Component;

public class MinMaxLengthValidation implements Validation {
    private int minLength;
    private int maxLength;

    public MinMaxLengthValidation(int minLength, int maxLength) {
        this.minLength = minLength;
        this.maxLength = maxLength;
    }

    public boolean minMaxLengthValidation(String data) {
        if (data.length() >= minLength && data.length() <= maxLength)
            return true;
        return false;
    }

    @Override
    public boolean validate(Object data) {
        return minMaxLengthValidation((String) data);
    }

}
