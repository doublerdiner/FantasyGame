package character.player.magic;

import character.player.creature.Dragon;
import spell.Flame;


public class Wizard extends Magic{
    public Wizard() {
        super("Wizard", 120, 3, new Flame(), new Dragon());
    }
}
