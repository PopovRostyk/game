package com;

public class Elf extends Character {
    public Elf() {
    super(10, 10);
    }
    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {c.setHp(0);}
        else{c.setPower(c.getPower() - 1);}
        if (this.getPower() == 0){this.setHp(0);}
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
