package com.company;

public class Main {

    public static void main(String[] args) {

        Boss skeletBoss = new Boss();
        skeletBoss.setHealth(400);
        skeletBoss.setDamage(50);
        skeletBoss.setfireProtection("Fair");
        System.out.println("Health Boss = " + skeletBoss.getHealth());
        System.out.println("Damage Boss = " + skeletBoss.getDamage());
        System.out.println("Defence boss from " + skeletBoss.getfireProtection());
        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + createHeroes()[i].getDamage() + createHeroes()[i].getfireBoll());
        }
    }
    public static Hero[] createHeroes() {
        Hero magic = new Hero(250, 50);
        Hero warrior = new Hero(220, 35);
        Hero defence = new Hero(210, 15, "arrow");
        Hero[] allHeroes = new Hero[]{magic,warrior,defence};
        return allHeroes;
    }

}





