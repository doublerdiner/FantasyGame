import character.enemy.Orc;
import character.player.melee.Dwarf;
import item.Item;
import item.heal.Herb;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
        private Dwarf dwarf;
        @Before
        public void setup(){
            dwarf = new Dwarf();
        }
        @Test
        public void characterHasName(){
            assertEquals("Grimley", dwarf.getName());
        }
        @Test
        public void characterHasHp(){
            assertEquals(175, dwarf.getHp());
        }
        @Test
        public void characterHasInventorySize(){
            assertEquals(3, dwarf.getInventorySize());
        }
        @Test
        public void characterStartsWithEmptyInventory(){
            assertEquals(0, dwarf.getInventory().size());
        }
        @Test
        public void characterCanHeal(){
            dwarf.heal(20);
            assertEquals(195, dwarf.getHp());
        }
        @Test
        public void characterCanBleed(){
            dwarf.bleed(20);
            assertEquals(155, dwarf.getHp());
        }
        @Test
        public void characterCanPickUpItem(){
            Herb herb = new Herb();
            dwarf.pickup(herb);
            assertEquals(1, dwarf.getInventory().size());
            assertEquals(herb, dwarf.getInventory().get(0));
        }
        @Test
        public void characterCanDropItem(){
            Herb herb = new Herb();
            dwarf.pickup(herb);
            Item answer = dwarf.drop(herb);
            assertEquals(0, dwarf.getInventory().size());
            assertEquals(herb, answer);
        }
        @Test
        public void characterCanAttack() {
            Orc orc = new Orc();
            String answer = dwarf.attack(orc);
            assertEquals(30, orc.getHp());
            assertEquals("The Orc has 30 hp remaining", answer);
        }
}
