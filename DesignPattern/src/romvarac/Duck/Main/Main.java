package romvarac.Duck.Main;

import romvarac.Duck.Abstraction.Duck;
import romvarac.Duck.TypeOf.MallardDuck;

public class Main {
	public static void main(String args[]){
		Duck duck = new MallardDuck();
		duck.performFly();
		duck.performQuack();
		duck.Display();
	}
}
