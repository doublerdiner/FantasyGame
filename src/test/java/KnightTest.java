import character.enemy.Orc;
import character.player.melee.Knight;
import item.Item;
import item.heal.Herb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    private Knight knight;
    @Before
    public void setup(){
        knight = new Knight();
    }
    @Test
    public void characterHasName(){
        assertEquals("White Knight", knight.getName());
    }
    @Test
    public void characterHasHp(){
        assertEquals(150, knight.getHp());
    }
    @Test
    public void characterHasInventorySize(){
        assertEquals(5, knight.getInventorySize());
    }
    @Test
    public void characterStartsWithEmptyInventory(){
        assertEquals(0, knight.getInventory().size());
    }
    @Test
    public void characterCanHeal(){
        knight.heal(20);
        assertEquals(170, knight.getHp());
    }
    @Test
    public void characterCanBleed(){
        knight.bleed(20);
        assertEquals(130, knight.getHp());
    }
    @Test
    public void characterCanPickUpItem(){
        Herb herb = new Herb();
        knight.pickup(herb);
        assertEquals(1, knight.getInventory().size());
        assertEquals(herb, knight.getInventory().get(0));
    }
    @Test
    public void characterCanDropItem(){
        Herb herb = new Herb();
        knight.pickup(herb);
        Item answer = knight.drop(herb);
        assertEquals(0, knight.getInventory().size());
        assertEquals(herb, answer);
    }
    @Test
    public void characterCanAttack(){
        Orc orc = new Orc();
        String answer = knight.attack(orc);
        assertEquals(25, orc.getHp());
        assertEquals("The Orc has 25 hp remaining", answer);
    }

}
