package item.treasure;

import item.Item;

public abstract class Treasure extends Item {
    private int value;

    public Treasure(String name, int size, int value) {
        super(name, size);
        this.value = value;
    }
}
