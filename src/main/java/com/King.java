package com;
import java.util.Random;

public class King extends Character {
    private static final int MAX_HP = 10;
    private static final int MAX_POWER = 10;
    private static final int MIN_HP = 5;
    private static final int MIN_POWER =  5;
    private static final Random RAND = new Random();
    private KickBehavior kickBehavior = new Sword();

    public King() {
        super(RAND.nextInt(MAX_HP) + MIN_HP, RAND.nextInt(MAX_POWER) + MIN_POWER);
    }

    @Override
    public void kick(Character c) {
        kickBehavior = ((cOne, cTwo) -> cTwo.setHp(cTwo.getHp() - (RAND.nextInt(MAX_POWER) + MIN_POWER)));
        kickBehavior.kick(this, c);
    }

    @Override
    public String toString() {
        return "King: "
                + "hp="
                + this.getHp()
                + ", power="
                + this.getPower();
    }
}
