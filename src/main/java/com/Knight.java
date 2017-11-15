package com;

import java.util.Random;

public class Knight extends Character {
    private KickBehavior kickBehavior = new Sword();
    private static final int maxHp = 21;
    private static final int maxPower = 21;
    private static final int minHP = 2;
    private static final int minPower =  2;
    private static final Random rand = new Random();
    public Knight() {
        super(rand.nextInt(maxHp) + minHP, rand.nextInt(maxPower) + minPower);
    }

    @Override
    public void kick(Character c) {
        kickBehavior = ((c1, c2) -> c2.setHp(c2.getHp() - rand.nextInt(maxPower) - minPower));
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
