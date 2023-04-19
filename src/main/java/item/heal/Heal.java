package item.heal;

import item.Item;

public abstract class Heal extends Item {
    private int recovery;
    private String buff;

    public Heal(String name, int size, int recovery, String buff) {
        super(name, size);
        this.recovery = recovery;
        this.buff = buff;
    }
}
