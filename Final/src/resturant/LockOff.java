package resturant;

/* this implements the lockoff class */

public class LockOff implements Command {
	
	Lock lock;
	
	public LockOff (Lock lock) {
		this.lock = lock;
	}
	
	public void execute() {
		lock.unlocked();
	}

}
