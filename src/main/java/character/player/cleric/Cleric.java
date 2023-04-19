package character.player.cleric;

import character.player.Player;
import item.heal.Heal;
import item.heal.Herb;
import item.heal.Potion;

public class Cleric extends Player {
    private Heal potion;

    public Cleric() {
        super("Cleric", 125, 10);
        this.potion = new Potion();
        pickup(new Potion());
        pickup(new Potion());
        pickup(new Potion());
        pickup(new Herb());
        pickup(new Herb());
    }
}
