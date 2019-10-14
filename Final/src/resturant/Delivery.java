package resturant;
/* This implements the delivery class  */
public class Delivery {
	
	String name;
	String specialinstructions;

	public String getName() {
		return name;
	}

	public void prep() {
		System.out.println("Fixin up " + name);
	}

	public void cook() {
		System.out.println("Cookin " + name);
	}

	public void bag() {
		System.out.println("Packing up " + name);
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + name + " ----\n");
		display.append(specialinstructions + "\n");
		return display.toString();
	}

}
