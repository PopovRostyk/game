package game;

import org.junit.Test;
import game.Character;
import game.Hobbit;

import static org.junit.Assert.*;

public class HobbitTest {
    Character hobbit = new Hobbit();
    int hp = hobbit.getHp();
    int power = hobbit.getPower();
    @Test
    public void testtoString() throws Exception {
        String msg = "Hobbit: hp=" + hobbit.getHp()  + ", power=" + hobbit.getPower();
        assertEquals(msg, hobbit.toString());
    }

    @Test
    public void getHp() throws Exception {
        assertEquals(hp, hobbit.getHp());
    }

    @Test
    public void setHp() throws Exception {
        hobbit.setHp(10);
        assertEquals(10, hobbit.getHp());
    }

    @Test
    public void getPower() throws Exception {
        assertEquals(power, hobbit.getPower());
    }

    @Test
    public void setPower() throws Exception {
        hobbit.setPower(15);
        assertEquals(15, hobbit.getPower());
    }

    @Test
    public void isAlive() throws Exception {
        assertTrue(hobbit.isAlive());
        hobbit.setHp(0);
        assertFalse(hobbit.isAlive());
    }

}