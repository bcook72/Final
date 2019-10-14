package resturant;

/* this implements the securitysystemoff class */

public class SecuritySystemOff implements Command {
	
	SecuritySystem securitySystem;

	public SecuritySystemOff(SecuritySystem securitySystem) {
		this.securitySystem = securitySystem;
	}

	public void execute() {
		securitySystem.off();
	}
}