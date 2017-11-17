package com;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CharacterFactoryTest {
    CharacterFactory characterFactory = new CharacterFactory();
    Character character = characterFactory.createCharacter();
    @Test
    public void createCharacter() throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();
        List<Class> arr = new ArrayList<>(Arrays.asList(Hobbit.class, Knight.class, King.class, Elf.class));
        for (int i = 0; i < 25; i++) {
            Character res = characterFactory.createCharacter();
            if (res != null){
                assertEquals(true,arr.contains(res.getClass()));}}
    }

}