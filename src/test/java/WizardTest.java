import character.enemy.Orc;
import character.player.magic.Wizard;
import character.player.melee.Knight;
import item.Item;
import item.heal.Herb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    private Wizard wizard;
    @Before
    public void setup(){
        wizard = new Wizard();
    }
    @Test
    public void characterHasName(){
        assertEquals("Wizard", wizard.getName());
    }
    @Test
    public void characterHasHp(){
        assertEquals(120, wizard.getHp());
    }
    @Test
    public void characterHasInventorySize(){
        assertEquals(3, wizard.getInventorySize());
    }
    @Test
    public void characterStartsWithEmptyInventory(){
        assertEquals(0, wizard.getInventory().size());
    }
    @Test
    public void characterStartsWithCompanion(){
        assertEquals("Dragon", wizard.getCompanion().getName());
    }
    @Test
    public void characterCanHeal(){
        wizard.heal(20);
        assertEquals(140, wizard.getHp());
    }
    @Test
    public void characterCanBleed(){
        wizard.bleed(20);
        assertEquals(100, wizard.getHp());
    }
    @Test
    public void characterCanPickUpItem(){
        Herb herb = new Herb();
        wizard.pickup(herb);
        assertEquals(1, wizard.getInventory().size());
        assertEquals(herb, wizard.getInventory().get(0));
    }
    @Test
    public void characterCanDropItem(){
        Herb herb = new Herb();
        wizard.pickup(herb);
        Item answer = wizard.drop(herb);
        assertEquals(0, wizard.getInventory().size());
        assertEquals(herb, answer);
    }
    @Test
    public void characterCanAttack(){
        Orc orc = new Orc();
        String answer = wizard.cast(orc);
        assertEquals(20, orc.getHp());
        assertEquals("The Orc has 20 hp remaining", answer);
    }
    @Test
    public void companionWillDefendWhenAttacked(){
        Orc orc = new Orc();
        String answer = orc.attack(wizard);
        assertEquals(120, wizard.getHp());
        assertEquals(90, wizard.getCompanion().getHp());
        assertEquals("Hi", answer);
    }
}
