package character.player.magic;

import character.enemy.Enemy;
import character.enemy.Orc;
import character.player.Player;
import character.player.creature.Creature;
import spell.Spell;

public abstract class Magic extends Player {
    private Spell spell;
    private Creature companion;

    public Magic(String name, int hp, int inventorySize, Spell spell, Creature companion) {
        super(name, hp, inventorySize);
        this.spell = spell;
        this.companion = companion;
    }

    public Spell getSpell() {
        return spell;
    }

    public Creature getCompanion() {
        return companion;
    }

    public String cast(Enemy enemy) {
        int attackPower = spell.getDamage();
        enemy.bleed(attackPower);
        if(enemy.getHp()<=0){
            return String.format("The %s is dead", enemy.getName());
        }
        else{
            return String.format("The %s has %s hp remaining", enemy.getName(), enemy.getHp());
        }
    }
}
