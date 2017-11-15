package com;

class GameManager {
    void fight(Character c1, Character c2){
        System.out.println(c1.toString() + " and " + c2.toString() + " started fight!");
        while(c1.isAlive() && c2.isAlive()){
            c1.kick(c2);
            System.out.println(c1 + "\n" + c2 + "\n" + "____________________");
            if (c2.isAlive() && c1.isAlive()){
            c2.kick(c1);
                System.out.println(c1 + "\n" + c2 + "\n" + "____________________");
            }
        }
        if (c1.isAlive()){
            System.out.println(c1 + " won the fight.");
        }
        if (c2.isAlive()) {
            System.out.println(c2 + " won the fight.");}
    }
}
