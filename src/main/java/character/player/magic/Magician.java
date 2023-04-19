package character.player.magic;

import character.player.creature.Rabbit;
import spell.TaDa;

public class Magician extends Magic{
    public Magician() {
        super("Party Time Tony", 20, 2, new TaDa(), new Rabbit());
    }
}
