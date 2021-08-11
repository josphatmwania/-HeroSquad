package models;

import  java.util.List;
import java.util.ArrayList;

// Hero object with Name, age & power
public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private  static List<Hero> heroRegistry = new ArrayList<>();
    private  int heroID;
    private static boolean duplicate = false;


    public Hero(String name, int age, String power, String weakness) {
        this.name = name.trim();
        this.age = age;
        this.power = power.trim();
        this.weakness = weakness.trim();
        findDuplicateHero(this);

        if (duplicate) {
            System.out.println("This is a Duplicate Hero!!");
        } else {
            heroRegistry.add(this);
            this.heroID = heroRegistry.size();
            this.squadFighters = "";
        }
    }

    // defining hero power

    public  void setPower(String power) {
        this.power;
    }

    // defining weakness

    public void setWeakness(String weakness) {
        this.weakness;
    }

    public  void setSquadFighters(String squadFighters) {
        this.setSquadFighters = squadFighters;
    }

    public String getSquadFighters() {
        return getSquadFighters;

    }

    public  String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public  String getPower() {
        return power;

    }

    public  String getWeakness() {
        return weakness;

    }
    public  int getHeroID() {
        return heroID;

    }
    public  static  List<Hero> getHeroRegistry() {
        return heroRegistry;
    }
}
