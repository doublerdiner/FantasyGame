package character.enemy;

import character.Character;
import character.player.Player;
import character.player.creature.Creature;
import character.player.magic.Magic;
import item.weapon.Weapon;

public abstract class Enemy extends Character {
    private Weapon weapon;

    public Enemy(String name, int hp, int inventorySize, Weapon weapon) {
        super(name, hp, inventorySize);
        this.weapon = weapon;
    }

    public String attackMagicPlayer(int attack, Player player){
        Magic convertPlayer = (Magic)player;
        Creature companion = convertPlayer.getCompanion();
        int creatureHealth = companion.getHp();
        if(creatureHealth>attack){
            companion.bleed(attack);
            return String.format("Your %s has %s hp remaining", companion.getName(), companion.getHp());
        }
        else if(creatureHealth>0){
            convertPlayer.getCompanion().bleed(attack);
            return String.format("Your %s is dead", convertPlayer.getCompanion().getName());
        }
        convertPlayer.bleed(attack);
        return"player";
    }

    public String attack(Player player) {
        int attackPower = weapon.getDamage();
        if(player instanceof Magic){
            String attack = attackMagicPlayer(attackPower, player);
            }
        else{player.bleed(attackPower);}
        if(player.getHp()<=0){
            return String.format("The %s is dead", player.getName());
        }
        else{
            return String.format("The %s has %s hp remaining", player.getName(), player.getHp());
        }
    }
}
