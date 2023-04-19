package character.player.melee;

import item.weapon.Sword;
import item.weapon.Weapon;

public class Knight extends Melee{
    public Knight() {
        super("White Knight", 150, 5, new Sword());
    }
}
