package chapter1.main;

import chapter1.duck.Duck;
import chapter1.duck.FlyRocketPowered;
import chapter1.duck.MallardDuck;
import chapter1.duck.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
