package romvarac.Duck.Behaviors;

import romvarac.Duck.Interface.FlyBehavior;

public class FlyWithWings implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("Fly with wings");
	}

}