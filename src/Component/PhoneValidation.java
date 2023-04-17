package Component;

public class PhoneValidation implements Validation{

    public boolean isPhoneNumber(String data){
        if(data.length() != 10 && !data.startsWith("08")){
            return false;
        }
        
        for(int i = 0; i < data.length(); i++){
            char c = data.charAt(i);
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean validate(Object data) {
        String strData = (String) data;
        return isPhoneNumber(strData);
    }
    
}
