package resturant;

/* this implements the shortcommand class */

public class ShortCommand implements Command {
	Command[] commands;
 
	public ShortCommand(Command[] commands) {
		this.commands = commands;
	}
 
	public void execute() {
		for (int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}
}