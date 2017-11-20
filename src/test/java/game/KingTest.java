package game;

import org.junit.Test;
import game.Character;
import game.King;

import static org.junit.Assert.*;

public class KingTest {
    Character king = new King();
    int hp = king.getHp();
    int power = king.getPower();
    @Test
    public void testtoString() throws Exception {
        String msg = "King: hp=" + king.getHp()  + ", power=" + king.getPower();
        assertEquals(msg, king.toString());
    }

    @Test
    public void getHp() throws Exception {
        assertEquals(hp, king.getHp());
    }

    @Test
    public void setHp() throws Exception {
        king.setHp(12);
        assertEquals(12, king.getHp());
    }

    @Test
    public void getPower() throws Exception {
        assertEquals(power, king.getPower());
    }

    @Test
    public void setPower() throws Exception {
        king.setPower(16);
        assertEquals(16, king.getPower());
    }

    @Test
    public void isAlive() throws Exception {
        assertTrue(king.isAlive());
        king.setHp(0);
        assertFalse(king.isAlive());
    }

}