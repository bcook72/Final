package resturant;

/* this implements the nullvalueiterator class */

import java.util.Iterator;

public class NullValueIterator implements Iterator<Component> {
   
	public Component next() {
		return null;
	}
  
	public boolean hasNext() {
		return false;
	}
}