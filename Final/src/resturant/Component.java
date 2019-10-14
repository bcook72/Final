package resturant;
/* This abstract class component implements other methods */
import java.util.*;

public abstract class Component {

	public void add(Component component) {
		throw new UnsupportedOperationException();
	}
	public void remove(Component component) {
		throw new UnsupportedOperationException();
	}
	public Component getChild(int i) {
		throw new UnsupportedOperationException();
	}
  
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}

	public abstract Iterator<Component> createIterator();
 
	public void print() {
		throw new UnsupportedOperationException();
	}
}
