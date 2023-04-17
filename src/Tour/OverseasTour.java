package Tour;

public class OverseasTour extends Tour{
    private String country;
    private double visaSurtax;
    public OverseasTour(String name, String description, int days, double basePrice, String country,
            double visaSurtax) {
        super(name, description, days, basePrice);
        this.country = country;
        this.visaSurtax = visaSurtax;
    }
    public String getCountry() {
        return country;
    }
    public double getVisaSurtax() {
        return visaSurtax;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setVisaSurtax(double visaSurtax) {
        this.visaSurtax = visaSurtax;
    }
    @Override
    public double priceTour() {
        return this.basePrice + this.visaSurtax;
    }
    
}
