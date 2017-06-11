package romvarac.Duck.TypeOf;

import romvarac.Duck.Abstraction.Duck;
import romvarac.Duck.Behaviors.NoWayFly;
import romvarac.Duck.Behaviors.Silience;

public class MallardDuck extends Duck{

	public MallardDuck() {
		flybehavior = new NoWayFly();
		quackBehavior = new Silience();
	}
	
	@Override
	public void Display() {
		System.out.println("Mallard Duck");
	}

}
