import character.enemy.Orc;
import character.player.cleric.Cleric;
import item.Item;
import item.heal.Herb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    private Cleric cleric;
    @Before
    public void setup(){
        cleric = new Cleric();
    }
    @Test
    public void characterHasName(){
        assertEquals("Cleric", cleric.getName());
    }
    @Test
    public void characterHasHp(){
        assertEquals(125, cleric.getHp());
    }
    @Test
    public void characterHasInventorySize(){
        assertEquals(10, cleric.getInventorySize());
    }
    @Test
    public void characterStartsWithEmptyInventory(){
        assertEquals(5, cleric.getInventory().size());
    }
    @Test
    public void characterCanHeal(){
        cleric.heal(20);
        assertEquals(145, cleric.getHp());
    }
    @Test
    public void characterCanBleed(){
        cleric.bleed(20);
        assertEquals(105, cleric.getHp());
    }
    @Test
    public void characterCanPickUpItem(){
        Herb herb = new Herb();
        cleric.pickup(herb);
        assertEquals(6, cleric.getInventory().size());
        assertEquals(herb, cleric.getInventory().get(5));
    }
    @Test
    public void characterCanDropItem(){
        Herb herb = new Herb();
        cleric.pickup(herb);
        Item answer = cleric.drop(herb);
        assertEquals(5, cleric.getInventory().size());
        assertEquals(herb, answer);
    }
}
