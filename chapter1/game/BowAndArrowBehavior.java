package chapter1.game;

/**
 * BowAndArrowBehavior
 */
public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("chopping an arrow with a bow");
    }

}