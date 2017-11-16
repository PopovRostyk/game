package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElfTest {
    Character elf = new Elf();
    int hp = elf.getHp();
    int power = elf.getPower();
    @Test
    public void isAlive() throws Exception {
        assertTrue(elf.isAlive());
        elf.setHp(0);
        assertFalse(elf.isAlive());
        elf.setHp(10);
        elf.setPower(0);
        assertFalse(elf.isAlive());
        elf.setHp(0);
        assertFalse(elf.isAlive());
    }

    @Test
    public void testtoString() throws Exception {
        String msg = "Elf: hp=" + elf.getHp()  + ", power=" + elf.getPower();
        assertEquals(msg, elf.toString());
    }

    @Test
    public void getHp() throws Exception {
        assertEquals(hp, elf.getHp());

    }

    @Test
    public void setHp() throws Exception {
        elf.setHp(12);
        assertEquals(12, elf.getHp());
    }

    @Test
    public void getPower() throws Exception {
        assertEquals(power, elf.getPower());
    }

    @Test
    public void setPower() throws Exception {
        elf.setPower(30);
        assertEquals(30, elf.getPower());
    }
}