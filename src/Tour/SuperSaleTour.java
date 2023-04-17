package Tour;

public class SuperSaleTour extends TourOption{
    
    private double saleRate;

    public SuperSaleTour(Tour option, double saleRate) {
        super(option);
        this.saleRate = saleRate;
    }

    @Override
    public double priceTour() {
       return super.getOption().basePrice * (1 - saleRate);
    }

    @Override
    public String getDescription() {
        return super.option.getDescription() + " - Thong tin giam gia: " + saleRate * 100 +"%";
    }
    
}
