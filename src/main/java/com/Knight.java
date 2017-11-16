package com;

import java.util.Random;

public class Knight extends Character {
    private KickBehavior kickBehavior = new Sword();
    private static final int MAX_HP = 19;
    private static final int MAX_POWER = 19;
    private static final int MIN_HP = 2;
    private static final int MIN_POWER =  2;
    private static final Random RAND = new Random();
    public Knight() {
        super(RAND.nextInt(MAX_HP) + MIN_HP,
                RAND.nextInt(MAX_POWER) + MIN_POWER);
    }

    @Override
    public void kick(Character c) {
        kickBehavior = ((characterOne, characterTwo) ->
                characterTwo.setHp(characterTwo.getHp()
                        - RAND.nextInt(MAX_POWER) - MIN_POWER));
        kickBehavior.kick(this, c);
    }

    @Override
    public String toString() {
        return "Knight: "
                + "hp="
                + this.getHp()
                + ", power="
                + this.getPower();
    }
}
