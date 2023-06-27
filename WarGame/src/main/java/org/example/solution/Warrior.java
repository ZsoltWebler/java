package org.example.solution;

import java.util.Objects;

public class Warrior {

    private String name;
    private int health;
    private int attackValue;
    private Army army;

    public Warrior(String name, int health, int attackValue) {
        this.name = name;
        this.health = health;
        this.attackValue = attackValue;
    }

    public Army getArmy() {
        return army;
    }

    public void setArmy(Army army) {
        this.army = army;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackValue() {
        return attackValue;
    }

    public void setAttackValue(int attackValue) {
        this.attackValue = attackValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return health == warrior.health && attackValue == warrior.attackValue && Objects.equals(name, warrior.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, health, attackValue);
    }
}
