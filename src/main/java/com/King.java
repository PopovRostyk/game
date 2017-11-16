package com;
import java.util.Random;

public class King extends Character {
    private static final int maxHp = 10;
    private static final int maxPower = 10;
    private static final int minHP = 5;
    private static final int minPower =  5;
    private static final Random rand = new Random();
    private KickBehavior kickBehavior = new Sword();

    public King() {
        super(rand.nextInt(maxHp) + minHP, rand.nextInt(maxPower) + minPower);
    }

    @Override
    public void kick(Character c) {
        kickBehavior = ((c1, c2) -> c2.setHp(c2.getHp() - (rand.nextInt(maxPower) + minPower)));
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
