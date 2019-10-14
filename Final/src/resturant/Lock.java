package resturant;

/* this implements the lock class */

public class Lock {
	String location = "";

	public Lock(String location) {
		this.location = location;
	}

	public void unlocked() {
		System.out.println(location + " unlocked");
	}

	public void locked() {
		System.out.println(location + " locked");
	}
}

