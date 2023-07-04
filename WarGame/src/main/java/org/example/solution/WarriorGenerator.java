package org.example.solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WarriorGenerator {

    private int attackMin;
    private int attackMax;
    private int healthMin;
    private int healthMax;
    List<String> firstNames;
    List<String> lastNames;

    public WarriorGenerator(int attackMin, int attackMax, int healthMin, int healthMax) throws FileNotFoundException {
        this.attackMin = attackMin;
        this.attackMax = attackMax;
        this.healthMin = healthMin;
        this.healthMax = healthMax;
        firstNames = new ArrayList<>();
        lastNames = new ArrayList<>();

        readNames();

    }

    public List<Warrior> getWarriors(int count) {
        List<Warrior> warriors = new ArrayList<>();
        Random rnd = new Random();
        Set<String> names = getNames(count);

        for (String name : names) {
            warriors.add(new Warrior(name, rnd.nextInt(healthMin, healthMax), rnd.nextInt(attackMin, attackMax)));
        }
        return warriors;

    }

    private Set<String> getNames(int count) {

        Set<String> names = new HashSet<>();
        Random rnd = new Random();

        while (names.size() < count) {

            String firstName = firstNames.get(rnd.nextInt(firstNames.size()));
            String lastName = lastNames.get(rnd.nextInt(lastNames.size()));
            names.add(firstName + " " + lastName);

        }

        return names;

    }

    private List<String> getNames_2(int count) {

        List<String> names = new ArrayList<>();
        Random rnd = new Random();

        while (names.size() < count) {

            String firstName = firstNames.get(rnd.nextInt(firstNames.size()));
            String lastName = lastNames.get(rnd.nextInt(lastNames.size()));
            String nameToAdd = firstName + " " + lastName;
            if (!names.contains(nameToAdd)) {
                names.add(nameToAdd);
            }

        }

        return names;

    }

    private void readNames() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("firstName.csv"));
        while (scanner.hasNext()) {
            firstNames.add(scanner.nextLine());
        }

        Scanner scanner_2 = new Scanner(new File("lastNames.csv"));
        while (scanner_2.hasNext()) {
            lastNames.add(scanner_2.nextLine());
        }

    }

}
