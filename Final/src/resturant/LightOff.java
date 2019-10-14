package resturant;

/* this implements the lightoff class */

public class LightOff implements Command {
	Light light;
 
	public LightOff(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.off();
	}
}