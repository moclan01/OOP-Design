package Tour;

public class FiveStarTour extends TourOption{

    public FiveStarTour(Tour option) {
        super(option);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double priceTour() {
        return super.getOption().basePrice * 1.5;
    }

    @Override
    public String getDescription() {
        return "Tour 5 sao: " + super.option.getDescription();
    }
    
    
}
