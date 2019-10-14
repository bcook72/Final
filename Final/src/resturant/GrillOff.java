package resturant;

/* this implements the grilloff class */

public class GrillOff implements Command{

	Grill grill;
	
	public GrillOff(Grill grill) {
		this.grill = grill;
	}
	
	public void execute() {
		grill.off();
	}
}
