package resturant;

/* this implements the grill class */

public class RemoteOn {
	
	public static void main(String args[]) {
		Remote remote = new Remote();
		
		Light kitchen = new Light ("Kitchen Area");		
		Light dinning = new Light ("Dinning Area");
		Lock lock = new Lock ("Resturant");
		Grill grillarea = new Grill ("Kitchen");
		SecuritySystem securitySystem = new SecuritySystem ("Resturant");
				
		LightOn kitchenOn = new LightOn(kitchen);
		LightOn dinningOn = new LightOn (dinning);
		LightOff kitchenOff = new LightOff(kitchen);
		LightOff dinningOff = new LightOff (dinning);
		LockOn lockOn = new LockOn(lock);
		LockOff lockOff = new LockOff(lock);
		GrillOn grillareaOn = new GrillOn(grillarea);
		GrillOff grillareaOff = new GrillOff(grillarea);
		SecuritySystemOn securityOn = new SecuritySystemOn(securitySystem);
		SecuritySystemOff securityOff = new SecuritySystemOff(securitySystem);
		
		Command[] open = {lockOff, kitchenOn, dinningOn, grillareaOn, securityOff};
		Command[] close = {lockOn, kitchenOff, dinningOff, grillareaOff, securityOn};
		
		ShortCommand openResturant = new ShortCommand(open);
		ShortCommand closeResturant = new ShortCommand(close);
		
		remote.setCommand(0, openResturant, closeResturant);
		
		System.out.println(remote);
		System.out.println("--- Let's Start the Day!---");
		remote.onButtonWasPushed(0);
		System.out.println("--- Let's Close Up Shop!---");
		remote.offButtonWasPushed(0);
		
	}
}
