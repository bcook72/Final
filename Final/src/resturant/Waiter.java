package resturant;

/* this implements the waiter class */

import java.util.Iterator;

public class Waiter {
	Component allMenus;
 
	public Waiter(Component allMenus) {
		this.allMenus = allMenus;
	}
 
	public void printMenu() {
		allMenus.print();
	}
  
	public void printVegetarianMenu() {
		Iterator<Component> iterator = allMenus.createIterator();

		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			Component component = iterator.next();
			try {
				if (component.isVegetarian()) {
					component.print();
				}
			} catch (UnsupportedOperationException e) {}
		}
	}
}
