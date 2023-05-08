package chapter1.main;

import chapter1.game.Knight;
import chapter1.game.BowAndArrowBehavior;
import chapter1.game.Character;;

public class GameSimulator {
    public static void main(String[] args) {
        Character k = new Knight();
        k.fight();
        k.setWeaponBehavior(new BowAndArrowBehavior());
        k.fight();
    }
}
