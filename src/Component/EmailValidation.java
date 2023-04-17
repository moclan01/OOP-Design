package Component;

public class EmailValidation implements Validation {

    public boolean isEmail(String data){
        int count = 0;
        for(int i = 0; i < data.length(); i++){
            if(data.charAt(i) == '@'){
                count++;
                
            }
        }
        if(count == 1 && data.contains(".")){
            return true;
        } else 
            return false;
    }

    @Override
    public boolean validate(Object data) {
        String strData = (String) data;
        return isEmail(strData);
    }
    
}
