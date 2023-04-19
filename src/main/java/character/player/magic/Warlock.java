package character.player.magic;

import character.player.creature.Creature;
import character.player.creature.Ogre;
import spell.DarkLightning;
import spell.Spell;

public class Warlock extends Magic{
    public Warlock() {
        super("Warlock", 150, 3, new DarkLightning(), new Ogre());
    }
}
