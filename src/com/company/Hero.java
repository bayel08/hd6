package com.company;

public class Hero {
    private int health;
    private int damage;
    private String fireBoll;

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }
    public int getHealth(){
        return health;
    }
    public int getDamage(){
        return damage;
    }

    public String getfireBoll() {
        return fireBoll;
    }
    public Hero(int health,int damage,String fireBoll){
        this.health = health;
        this.damage = health;
        this.fireBoll =fireBoll;
    }
}

