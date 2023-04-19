package character.enemy;

import item.weapon.RustySword;

public class Troll extends Enemy{
    public Troll() {
        super("Troll", 75, 0, new RustySword());
    }
}
