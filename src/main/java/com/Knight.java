package com;

import java.util.Random;

public class Knight extends Character{
    private static int maxHp = 21;
    private static int maxPower = 21;
    private static int minHP = 2;
    private static int minPower =  2;
    private static Random rand = new Random();
    public Knight() {
        super(rand.nextInt(maxHp) + minHP, rand.nextInt(maxPower) + minPower);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - this.getPower());
        int pow = rand.nextInt(maxPower) + minPower;
        this.setPower(pow);
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
