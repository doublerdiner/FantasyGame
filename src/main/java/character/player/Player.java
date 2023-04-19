package character.player;

import character.Character;

public abstract class Player extends Character {
    public Player(String name, int hp, int inventorySize) {
        super(name, hp, inventorySize);
    }
}
