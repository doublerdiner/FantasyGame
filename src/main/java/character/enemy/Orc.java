package character.enemy;

import item.weapon.RustySword;

public class Orc extends Enemy{
    public Orc() {
        super("Orc", 50, 0, new RustySword());
    }
}
