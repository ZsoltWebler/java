package org.example.solution;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.util.Scanner;

public class ArmyManager {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static void saveArmy(Army army, String fileName) throws IOException {

        String json = MAPPER.writeValueAsString(army);

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(json);
        writer.close();


    }

    public static Army loadArmy(String fileName) throws IOException {


        Army army = MAPPER.readValue(new File(fileName), Army.class);

        for(Warrior warrior: army.getWarriors()){
            warrior.setArmy(army);
        }

        return army;

    }


}
