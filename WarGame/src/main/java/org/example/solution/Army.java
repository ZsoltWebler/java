package org.example.solution;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Army {

    private String name;
    private List<Warrior> warriors;


    public Army(String name, List<Warrior> warriors, WarriorSelectionStrategy selectionStrategy) {
        this.name = name;
        this.warriors = warriors;
        this.warriors.forEach(warrior -> warrior.setArmy(this));
        sort(selectionStrategy);
    }

    private void sort(WarriorSelectionStrategy selectionStrategy) {
        switch (selectionStrategy) {
            case TOUGHEST_FIRST:
                warriors.sort(Comparator.comparingInt(Warrior::getHealth));
                break;
            case STRONGEST_FIRST:
                warriors.sort(Comparator.comparingInt(Warrior::getAttackValue));
                break;
            case RANDOM:
                Collections.shuffle(warriors);
                break;
        }
    }

    public String getName() {
        return name;
    }

    public Warrior getWarrior() {

        if (warriors.size() > 0) {
            return warriors.remove(warriors.size() - 1);
        }

        return null;


    }


}
