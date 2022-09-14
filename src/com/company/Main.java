package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
  Boss myBoss = new Boss();
myBoss.setHp(500);
myBoss.setDamage(100);
myBoss.setDefense("defense magic");
        System.out.println(  " Boss hp " +myBoss.getHp() + " "+ "  damage " +myBoss.getDamage()+
                " " +" Defense " + myBoss.getDefense());
        for (int i = 0; i <createHeroes().length ; i++) {
            System.out.println("номер героя № " + (i+1) + " " + createHeroes()[i]);

            ;
        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(200, 50, "Vampir");
        Hero hero2 = new Hero(190, 60, "Sniper");
        Hero hero3 = new Hero(180, 70, "Ursa");
        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;



    }


}
