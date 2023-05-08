package chapter1.game;

public class SwordWeapon implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("swinging a sword");
    }

}
