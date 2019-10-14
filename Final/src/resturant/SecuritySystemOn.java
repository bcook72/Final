package resturant;

/* this implements the securitysystemon class */

public class SecuritySystemOn implements Command {
	
	SecuritySystem securitySystem;

	public SecuritySystemOn(SecuritySystem securitySystem) {
		this.securitySystem = securitySystem;
	}

	public void execute() {
		securitySystem.on();
	}
}