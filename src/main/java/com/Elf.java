package com;

public class Elf extends Character {
    private KickBehavior kickBehavior = new Sword();
    public Elf() {
    super(10, 10);
    }
    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            kickBehavior = (characterOne, characterTwo) -> characterTwo.setHp(0);
        }
        else { kickBehavior = (characterOne, characterTwo) -> characterTwo.setPower(characterTwo.getPower() - 1);
        }
        kickBehavior.kick(this, c);
    }

    @Override
    public boolean isAlive() {
        return (this.getPower() > 0 && this.getHp() > 0);
    }

    @Override
    public String toString() {
        return "Elf: "
                + "hp="
                + this.getHp()
                + ", power="
                + this.getPower();
    }
}
