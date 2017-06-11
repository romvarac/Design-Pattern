package romvarac.Duck.Behaviors;

import romvarac.Duck.Interface.QuackBehavior;

public class Silience implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Silience");
	}
	
}
