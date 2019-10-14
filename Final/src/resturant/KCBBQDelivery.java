package resturant;

/* this implements the kcbbqdelivery class */

public class KCBBQDelivery {
	DeliveryService order;
	
	public KCBBQDelivery (DeliveryService order) {
		this.order = order;
	}
	
	public Delivery newOrder(String type) {
		Delivery delivery;
		
		delivery = order.createOrder(type);
		
		delivery.prep();
		delivery.cook();
		delivery.bag();
		
		return delivery;
	}
}
