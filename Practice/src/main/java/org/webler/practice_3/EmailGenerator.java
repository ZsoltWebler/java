package org.webler.practice_3;

import java.io.*;
import java.util.*;

public class EmailGenerator {

    public static void createMails() {
        Set<String> emails = new HashSet<>();
        List<String> namesFromFile;
        try {
            namesFromFile = readNamesFromFile();
        } catch (Exception e) {
            return;
        }

        for (String name : namesFromFile) {

            String emailCandidate = convertNameToEmail(name);

            boolean inserted = emails.add(emailCandidate + "@webler.hu");
            int counter = 2;
            while (!inserted) {

                inserted = emails.add(emailCandidate + "_" + counter + "@webler.hu");
                counter++;

            }

        }

        writeToFile(emails);
    }

    private static List<String> readNamesFromFile() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("W:\\Webler\\JuniorJava\\Git\\java\\Practice\\src\\main\\resources\\practice_3\\nevek.txt"));
        List<String> names = new ArrayList<>();

        while (scanner.hasNextLine()) {
            names.add(scanner.nextLine());
        }

        return names;

    }

    private static String convertNameToEmail(String name) {

        String[] nameArray = name.split(" ");
        String firstPart = nameArray[0].substring(0, 3).toUpperCase();
        String secondPart = nameArray[1].substring(0, 2).toLowerCase();


        return firstPart + "_" + secondPart;
    }

    private static void writeToFile(Set<String> emails) {

        for (String email : emails) {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("email.txt", true));
                writer.write(email + "\n");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
