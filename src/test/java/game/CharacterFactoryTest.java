package game;

import org.junit.Test;
import game.*;
import game.Character;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CharacterFactoryTest {
    @Test
    public void createCharacter() throws Exception {
        CharacterFactory characterFactory = new CharacterFactory();
        List<Class> arr = new ArrayList<>(Arrays.asList(Hobbit.class, Knight.class, King.class, Elf.class));
        for (int i = 0; i < 15; i++) {
            Character character = characterFactory.createCharacter();
            if (character != null){
                assertTrue(arr.contains(character.getClass()));}}
    }

}