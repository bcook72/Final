package resturant;

/* this implements the grillon class */

public class GrillOn implements Command{

	Grill grill;
	
	public GrillOn (Grill grill) {
		this.grill = grill;
	}
	
	public void execute() {
		grill.on();
		grill.grillheat();
	}
}
