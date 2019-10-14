package resturant;

/* this implements the grill class */

public class Grill {

	String location = "";
	int temperature;

	public Grill(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " Grill is on");
	}

	public void off() {
		System.out.println(location + " Grill is off");
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public void grillheat() {
		temperature = 105;
		System.out.println("Grill is set to 450 degrees");
	}

}