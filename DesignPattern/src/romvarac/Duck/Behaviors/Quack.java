package romvarac.Duck.Behaviors;

import romvarac.Duck.Interface.QuackBehavior;

public class Quack implements QuackBehavior{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}
