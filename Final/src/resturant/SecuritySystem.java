package resturant;

/* this implements the securitysystem class */

public class SecuritySystem {
	String location = "";

	public SecuritySystem(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " security system is on");
	}

	public void off() {
		System.out.println(location + " security system is off");
	}
}

