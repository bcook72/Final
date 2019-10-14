package resturant;

/* this implements the placeorder class */

public class PlaceOrder {

	public static void main (String[] args) {
		DeliveryService deliver1 = new DeliveryService();
		KCBBQDelivery order1 = new KCBBQDelivery(deliver1);
		
		Delivery delivery = order1.newOrder("Breakfast");
		System.out.println("We ordered a " + delivery.getName() + "\n");
		System.out.println(delivery);
		
		delivery = order1.newOrder("Lunch");
		System.out.println("We ordered a " + delivery.getName() + "\n");
		System.out.println(delivery);
		
		delivery = order1.newOrder("Dinner");
		System.out.println("We ordered a " + delivery.getName() + "\n");
		System.out.println(delivery);
	}
}
