package resturant;

/* this implements the kcbbqmenutest class */

public class KCBBQMenuTest {
	public static void main(String args[]) {
		
		Component kcbbqHouseMenu = 
			new KCBBQMenu("KC BBQ Smokehouse Resturant", "Breakfast");
		Component kcbbqlunchMenu = 
			new KCBBQMenu("KC BBQ Smokehouse Resturant", "Lunch");
		Component kcbbqdinnerMenu = 
			new KCBBQMenu("KC BBQ Smokehouse Resturant", "Dinner");
		Component dessertMenu = 
			new KCBBQMenu("KC BBQ Smokehouse Resturant", "Dessert");
  
		Component allMenus = new KCBBQMenu("ALL Menus", "Items served all day long");
  
		allMenus.add(kcbbqHouseMenu);
		allMenus.add(kcbbqlunchMenu);
		allMenus.add(kcbbqdinnerMenu);
  
		kcbbqHouseMenu.add(new KCBBQMenuItems(
			"KC's Best French Toast", 
			"Thick sliced and hand dipped in our special cream and spice batter, sprinkled with powdered sugar and topped with whipped butter served with eggs", 
			true,
			9.59));
		kcbbqHouseMenu.add(new KCBBQMenuItems(
			"KC's Eggs Benedict", 
			"Two farm-fresh poached eggs and shaved ham on top of a toasted split buttermilk biscuit, topped with classic hollandaise sauce and a choice of home fries or cheddar grits", 
			false,
			11.95));
		kcbbqHouseMenu.add(new KCBBQMenuItems(
			"Sunshine Breakfast",
			"Two farm-fresh eggs cracked into thick sliced Texas toast, served with home fries or cheddar grits and fruit",
			true,
			6.99));
		kcbbqHouseMenu.add(new KCBBQMenuItems(
			"Eggs n Such",
			"Huge burrito loaded with peppers, cherry tomatoes, potatoes, green chiles, scrambled eggs, and cheddar cheese smothered in ranchero sauce served with a fruit cup.",
			true,
			8.10));

		kcbbqlunchMenu.add(new KCBBQMenuItems(
			"Veggie Burger",
			"Hand made vegetarian burger topped with cheddar cheese, carmelized onions, lettuce, tomatoes and our fresh made signature sandwich sauce", 
			true, 
			7.50));
		kcbbqlunchMenu.add(new KCBBQMenuItems(
			"Pulled Chicken Breast Sandwich",
			"Smoked chicken breast, BBQ mayo, lettuce and tomato jam", 
			false, 
			10.48));
		kcbbqlunchMenu.add(new KCBBQMenuItems(
			"Soup of the day",
			"A bowl of the soup of the day, with a side of cole slaw", 
			false, 
			4.28));
		kcbbqlunchMenu.add(new KCBBQMenuItems(
			"The Hog",
			"Pulled pork and sliced sausage on a bun",
			false, 
			6.15));
		kcbbqlunchMenu.add(new KCBBQMenuItems(
			"The Veg",
			"Caramelized Onions, Fire Roasted Red Peppers, Green Bell Peppers, Sauteed Mushrooms, French Fries, Jack Cheese, Sour Cream, Avocado and BBQ Sauce.", 
			true, 
			8.49));
 
		kcbbqlunchMenu.add(new KCBBQMenuItems(
			"Oh Yeah",
			"French Fries, Cheddar Cheese. Sour Cream, Green Onion, 2 over easy eggs on top and BBQ sauce",
			true, 
			5.78));
   
		kcbbqlunchMenu.add(dessertMenu);
  
		dessertMenu.add(new KCBBQMenuItems(
			"Warm Apple Crisp",
			"Apple crisp with a flakey crust, topped with vanilla icecream",
			true,
			3.62));
		dessertMenu.add(new KCBBQMenuItems(
			"Bread Pudding",
			"Signature bread pudding topped with our own bourbon pecan sauce",
			true,
			5.69));
		dessertMenu.add(new KCBBQMenuItems(
			"S'Mores",
			"Graham crackers, Hershey's chocolate, homemade marshmallows and salted caramel sauce",
			true,
			4.21));

		kcbbqdinnerMenu.add(new KCBBQMenuItems(
				"1/2 Slab",
				"1/2 slab of pork ribs, baked beans, and corn bread", 
				false, 
				15.22));
		kcbbqdinnerMenu.add(new KCBBQMenuItems(
				"Full Slab",
				"Full slab of pork ribs, baked beans, mac salad, and corn bread", 
				false, 
				18.64));
		kcbbqdinnerMenu.add(new KCBBQMenuItems(
				"Smoked Chicken",
				"Smoked chicken breast, with collard greens, baked beans and corn bread", 
				false, 
				13.44));
		kcbbqdinnerMenu.add(new KCBBQMenuItems(
			"Soup of the day",
			"A cup of the soup of the day, with a cole slaw",
			false, 
			5.13));
		kcbbqdinnerMenu.add(new KCBBQMenuItems(
			"Cobb without the Meat",
			"Mixed greens, Tofu, egg, tomatoes, avocado and Bleu cheese crumbles with ranch dressing",
			true, 
			8.75));
 
		Waiter waiter = new Waiter(allMenus);
   
		waiter.printVegetarianMenu();
		waiter.printMenu();
 
	}
}