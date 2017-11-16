package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameManagerTest {
    CharacterFactory charFact = new CharacterFactory();
    GameManager gameManager = new GameManager();
    Character c1 = charFact.createCharacter();
    Character c2 = charFact.createCharacter();
    @Test
    public void fight() throws Exception {
        gameManager.fight(c1, c2);
        assertTrue((!(c1.isAlive()) || !(c2.isAlive())));
    }

}