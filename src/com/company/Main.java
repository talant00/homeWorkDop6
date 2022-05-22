package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weaponBoss = new Weapon();
        weaponBoss.setWeaponName("bone arrows");
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(65);
        boss.setWeapon(weaponBoss);
    }
}