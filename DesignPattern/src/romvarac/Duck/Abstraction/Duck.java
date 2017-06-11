package romvarac.Duck.Abstraction;

import romvarac.Duck.Interface.FlyBehavior;
import romvarac.Duck.Interface.QuackBehavior;

public abstract class Duck {
	public FlyBehavior flybehavior;
	public QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public FlyBehavior getFlybehavior() {
		return flybehavior;
	}

	public void setFlybehavior(FlyBehavior flybehavior) {
		this.flybehavior = flybehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public abstract void Display();
	
	public void performFly(){
		flybehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}
}
