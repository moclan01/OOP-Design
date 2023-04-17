package Tour;

public class DomesticTour extends Tour {

    public DomesticTour(String name, String description, int days, double basePrice) {
        super(name, description, days, basePrice);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double priceTour() {
        return this.basePrice;
    }
    
}
