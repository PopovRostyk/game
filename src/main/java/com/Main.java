package com;
class Main {
    public static void main(String[] args){
        CharacterFactory charFact = new CharacterFactory();
        GameManager gameManager = new GameManager();
        Character c1 = charFact.createCharacter();
        Character c2 = charFact.createCharacter();
        gameManager.fight(c1, c2);
    }
}