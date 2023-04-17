package Tour;

public class TestTour {
    public static void main(String[] args) {
        Tour tour1 = new DomesticTour("PThiet", "Phan Thiet - Mui Ne", 3, 550000);
        Tour tour2 = new DomesticTour("NTrang", "Nha Trang", 4, 900000);
        Tour tour3 = new DomesticTour("DLNT", "Da Lat - Nha Trang", 4, 1250000);
        Tour tour4 = new OverseasTour("Thai", "HCM - Bangkok - Pattaya - Koh Island", 5, 3600000, "Thailand", 500000);

        System.out.println(tour1.priceTour());
        System.out.println(tour4.priceTour());
		System.out.println(tour1.getDescription());
		System.out.println(tour2.getDescription());
		
		TourOption t3 = new FiveStarTour(tour1);
		TourOption t4 = new SuperSaleTour(tour4, 0.1); 
		System.out.println(tour1.priceTour());
		System.out.println(t4.priceTour());
		System.out.println(t3.getDescription());
		System.out.println(t4.getDescription());
        
    }
}
