package com;
import java.util.List;

import java.util.ArrayList;
import java.util.Random;

class CharacterFactory {
    private static List<Character> chars= new ArrayList<>();
    private static Random rand = new Random();
    public Character createCharacter(){
        chars.add(new Elf());
        chars.add(new Hobbit());
        chars.add(new King());
        chars.add(new Knight());
        int randNum = rand.nextInt(chars.size());
        return chars.get(randNum);
    }
}