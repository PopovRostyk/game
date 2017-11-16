package com;

public abstract class Character {
    private int hp;
    private int power;

    Character(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    void setPower(int power) {
        this.power = power;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void kick(Character c) {
    }

    @Override
    public String toString() {
        return "Character: "
                + "hp="
                + hp
                + ", power="
                + power;
    }
}

