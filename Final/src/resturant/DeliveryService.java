package resturant;

/* This implements the deliveryservice class */

public class DeliveryService {
	
	public Delivery createOrder(String type) {
		Delivery delivery = null;
		
	if (type.equals("Breakfast")) {
		delivery = new SunshineBreakfast();
	} else if (type.equals("Lunch")) {
		delivery = new OhYeah();
	} else if (type.equals("Dinner")) {
		delivery = new FullSlab();
	}
	 return delivery;
	}
}