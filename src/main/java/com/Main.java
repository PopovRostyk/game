package com;


public class Main {
    public static void main(String[] args) {
        CharacterFactory charFact = new CharacterFactory();
        GameManager gameManager = new GameManager();
        Character c1 = (Character) charFact.createCharacter();
        Character c2 = (Character) charFact.createCharacter();
        gameManager.fight(c1, c2);
    }
}
