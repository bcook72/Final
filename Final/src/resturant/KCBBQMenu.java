package resturant;

import java.util.Iterator;
import java.util.ArrayList;

public class KCBBQMenu extends Component {
	Iterator<Component> iterator = null;
	ArrayList<Component> bbqmenuComponents = new ArrayList<Component>();
	String name;
	String description;
  
	public KCBBQMenu(String name, String description) {
		this.name = name;
		this.description = description;
	}
 
	public void add(Component component) {
		bbqmenuComponents.add(component);
	}
 
	public void remove(Component component) {
		bbqmenuComponents.remove(component);
	}
 
	public Component getChild(int i) {
		return bbqmenuComponents.get(i);
	}
 
	public String getName() {
		return name;
	}
 
	public String getDescription() {
		return description;
	}

  
	public Iterator<Component> createIterator() {
		if (iterator == null) {
			iterator = new KCBBQMenuIterator(bbqmenuComponents.iterator());
		}
		return iterator;
	}
 
 
	public void print() {
		System.out.print("\n" + getName());
		System.out.println(", " + getDescription());
		System.out.println("---------------------");
  
		Iterator<Component> iterator = bbqmenuComponents.iterator();
		while (iterator.hasNext()) {
			Component component = iterator.next();
			component.print();
		}
	}
}
