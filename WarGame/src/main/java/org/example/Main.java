package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.solution.*;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        WarriorGenerator warriorGenerator = new WarriorGenerator(1, 100, 1, 100);

        warriorGenerator.getWarriors(10).forEach(warrior -> System.out.print("\""+warrior.getName()+"\""+", "));


        Army army = new Army("TestArmy", warriorGenerator.getWarriors(10), WarriorSelectionStrategy.TOUGHEST_FIRST);
        Army army_2 = new Army("TestArmy_2", warriorGenerator.getWarriors(10), WarriorSelectionStrategy.TOUGHEST_FIRST);

        /*
        Warrior warrior_1 = new Warrior("TestWarrior_1", 2000, 100);
        Warrior warrior_2 = new Warrior("TestWarrior_2", 1100, 140);
        Warrior warrior_3 = new Warrior("TestWarrior_3", 1200, 120);
        Warrior warrior_4 = new Warrior("TestWarrior_4", 2300, 130);


        Army army = new Army("TestArmy_1", new ArrayList<>(List.of(warrior_1, warrior_3)), WarriorSelectionStrategy.TOUGHEST_FIRST);
        Army army_2 = new Army("TestArmy_2", new ArrayList<>(List.of(warrior_2, warrior_4)), WarriorSelectionStrategy.STRONGEST_FIRST);
        */
        War war = new War();

        war.battle(army, army_2);


    }
}