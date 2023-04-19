package character.player.creature;

import character.player.Player;

public abstract class Creature extends Player {
    public Creature(String name, int hp, int inventorySize) {
        super(name, hp, inventorySize);
    }

}
