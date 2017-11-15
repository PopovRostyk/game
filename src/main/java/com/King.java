package com;
import java.util.Random;

public class King extends Character{
    private static int maxHp = 15;
    private static int maxPower = 15;
    private static int minHP = 5;
    private static int minPower =  5;
    private static Random rand = new Random();

    King() {
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
        return "King: "
                + "hp="
                + this.getHp()
                + ", power="
                + this.getPower();
    }
}
