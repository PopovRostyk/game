package game;

import org.junit.Test;
import game.Character;
import game.Knight;

import static org.junit.Assert.*;

public class KnightTest {
    Character knight = new Knight();
    int hp = knight.getHp();
    int power = knight.getPower();
    @Test
    public void testtoString() throws Exception {
        String msg = "Knight: hp=" + knight.getHp()  + ", power=" + knight.getPower();
        assertEquals(msg, knight.toString());
    }

    @Test
    public void getHp() throws Exception {
        assertEquals(hp, knight.getHp());
    }

    @Test
    public void setHp() throws Exception {
        knight.setHp(10);
        assertEquals(10, knight.getHp());
    }

    @Test
    public void getPower() throws Exception {
        assertEquals(power, knight.getPower());
    }

    @Test
    public void setPower() throws Exception {
        knight.setPower(10);
        assertEquals(10, knight.getPower());
    }

    @Test
    public void isAlive() throws Exception {
        assertTrue(knight.isAlive());
        knight.setHp(0);
        assertFalse(knight.isAlive());
    }

}