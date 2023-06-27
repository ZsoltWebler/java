package org.example;

import org.example.solution.Army;
import org.example.solution.War;
import org.example.solution.Warrior;
import org.example.solution.WarriorSelectionStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Warrior warrior_1 = new Warrior("TestWarrior_1", 2000, 100);
        Warrior warrior_2 = new Warrior("TestWarrior_2", 1100, 140);
        Warrior warrior_3 = new Warrior("TestWarrior_3", 1200, 120);
        Warrior warrior_4 = new Warrior("TestWarrior_4", 2300, 130);


        Army army = new Army("TestArmy_1", new ArrayList<>(List.of(warrior_1, warrior_3)), WarriorSelectionStrategy.TOUGHEST_FIRST);
        Army army_2 = new Army("TestArmy_2", new ArrayList<>(List.of(warrior_2, warrior_4)), WarriorSelectionStrategy.STRONGEST_FIRST);

        War war = new War();

        war.battle(army, army_2);


    }
}