package chapter1.game;

public abstract class Character {
    WeaponBehavior weapon;

    Character() {
    }

    public void performUseWeapon() {
        weapon.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weapon = w;
    }

    public abstract void fight();
}
