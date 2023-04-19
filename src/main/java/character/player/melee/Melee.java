package character.player.melee;

import character.enemy.Enemy;
import character.enemy.Orc;
import character.player.Player;
import item.weapon.Weapon;

public abstract class Melee extends Player {
    private Weapon weapon;
    public Melee(String name, int hp, int inventorySize, Weapon weapon) {
        super(name, hp, inventorySize);
        this.weapon = weapon;
    }

    public String attack(Enemy enemy) {
        int attackPower = weapon.getDamage();
        enemy.bleed(attackPower);
        if(enemy.getHp()<=0){
            return String.format("The %s is dead", enemy.getName());
        }
        else{
            return String.format("The %s has %s hp remaining", enemy.getName(), enemy.getHp());
        }
    }
}
