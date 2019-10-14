package resturant;

/* this implements the lockon class */

public class LockOn implements Command {
	
	Lock lock;
	
	public LockOn (Lock lock) {
		this.lock = lock;
	}
	
	public void execute() {
		lock.locked();
	}

}
