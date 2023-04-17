package Tour;

public abstract class TourOption implements TourInterface{
    protected Tour option;

    public TourOption(Tour option) {
        this.option = option;
    }

    public Tour getOption() {
        return option;
    }

    public void setOption(Tour option) {
        this.option = option;
    }
    
}
