package Component;

import java.util.ArrayList;
import java.util.List;

public abstract class Component {
    protected Object data;
    protected List<Validation> types;
    
    public Component(Object data) {
        this.data = data;
        this.types = new ArrayList<Validation>();
    }

    public List<Validation> getTypes() {
        return types;
    }
    
    public void setTypes(List<Validation> types) {
        this.types = types;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    public void addValidation(Validation type) {
        types.add(type);     
    }

    public void setComponentTypes(Validation... types) {
        for (Validation type : types)
            this.addValidation(type);
    }

    public void validate() {
        for (Validation type : this.types) {
            if(!type.validate(this.data)) {
                System.out.println("Khong hop le");
                return;
            }
        }
        System.out.println("Hop le");
    }
    
}
