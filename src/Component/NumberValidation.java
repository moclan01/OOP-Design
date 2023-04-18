package Component;

public class NumberValidation implements Validation {
    public boolean isNumber(String data) {

        // Kiểm tra xem chuỗi đầu vào có rỗng hay không, nếu rỗng thì không phải là số.
        if (data.isBlank()) {
            return false;
        }

        // Kiểm tra xem chuỗi đầu vào có chứa các ký tự không phải số hay không, nếu có
        // thì không phải là số.
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) < '0' && data.charAt(i) > '9') {
                return false;
            }
        }

        // Kiểm tra xem chuỗi đầu vào có chứa nhiều hơn một dấu chấm hay không, nếu có
        // thì không phải là số.
        int count = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == '.') {
                count++;
            }
        }
        if (count > 1)
            return false;

        // Nếu chuỗi đầu vào chỉ chứa duy nhất một dấu chấm, thì kiểm tra xem phía trước
        // và phía sau dấu chấm có phải là số hay không.
        for (int i = 0; i < data.length(); i++) {
            if (count == 1) {
                String[] part = data.split("\\.");
                char c1 = part[0].charAt(i);
                char c2 = part[1].charAt(i);
                if (!Character.isDigit(c1) && !Character.isDigit(c2)) {
                    return false;
                }
            }
        }

        // Nếu chuỗi đầu vào không chứa dấu chấm, thì kiểm tra xem toàn bộ chuỗi có phải
        // là số nguyên hay không.
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (Character.isDigit(c))
                return true;
        }

        return true;
    }

    @Override
    public boolean validate(Object data) {
        String strData = (String) data;
        return isNumber(strData);
    }

}
