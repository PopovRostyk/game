package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterFactoryTest {
    CharacterFactory characterFactory = new CharacterFactory();
    Character character = characterFactory.createCharacter();
    @Test
    public void createCharacter() throws Exception {
        assertEquals(new Elf().getClass().getSuperclass().getSimpleName(), character.getClass().getSuperclass().getSimpleName());
    }

}