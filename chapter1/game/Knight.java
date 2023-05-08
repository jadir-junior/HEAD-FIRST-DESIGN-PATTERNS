package chapter1.game;

public class Knight extends Character {

    public Knight() {
        weapon = new SwordWeapon();
    }

    @Override
    public void fight() {
        performUseWeapon();
    }

}
