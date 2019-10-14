package resturant;

/* this implements the lighton class */

public class LightOn implements Command {
	
	Light light;

	public LightOn(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}