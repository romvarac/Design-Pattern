package romvarac.Duck.Behaviors;

import romvarac.Duck.Interface.FlyBehavior;

public class NoWayFly implements FlyBehavior{

	@Override
	public void fly() {
		System.out.println("No way fly");
	}

}
