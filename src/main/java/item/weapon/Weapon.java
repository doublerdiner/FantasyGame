package item.weapon;

import item.Item;

public abstract class Weapon extends Item {
    private int damage;
    private String buff;

    public Weapon(String name, int damage, int size, String buff) {
        super(name, size);
        this.damage = damage;
        this.buff = buff;
    }

    public int getDamage() {
        return damage;
    }

    public String getBuff() {
        return buff;
    }
}
