package org.webler.practice_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {


        Scanner scanner = new Scanner(new File("W:\\Webler\\JuniorJava\\Git\\java\\Practice\\src\\main\\resources\\practice_2\\musor.txt"));

        List<Zeneszam> zenek_1 = new ArrayList<>();
        List<Zeneszam> zenek_2 = new ArrayList<>();
        List<Zeneszam> zenek_3 = new ArrayList<>();
        while (scanner.hasNextLine()) {
            String row = scanner.nextLine();

            String[] s = row.split(" ", 4);
            int radio = Integer.parseInt(s[0]);
            int min = Integer.parseInt(s[1]);
            int sec = Integer.parseInt(s[2]);

            String[] split = s[3].split(":");

            String musician = split[0];
            String track = split[1];

            if (radio == 1) {
                zenek_1.add(new Zeneszam(musician, track, min * 60 + sec));
            } else if (radio == 2) {
                zenek_2.add(new Zeneszam(musician, track, min * 60 + sec));
            } else if (radio == 3) {
                zenek_3.add(new Zeneszam(musician, track, min * 60 + sec));
            }
        }

        Set<Zeneszam> osszesZene = new HashSet<>();
        osszesZene.addAll(zenek_1);
        osszesZene.addAll(zenek_2);
        osszesZene.addAll(zenek_3);

        System.out.println(getIndex(zenek_1, 1));
        System.out.println(getIndex(zenek_1, 504));
        System.out.println(zenekAdottIdoben(zenek_1, 1, 504));

        int ora = 3600;
        int ketOra = 7200;
        int jelenlegiIdo = 0;
        List<Zeneszam> miAdonk = new ArrayList<>();

        for (int i = 0; i < 160; i++) {

            Set<Zeneszam> tiltottZenek = new HashSet<>();
            tiltottZenek.addAll(zenekAdottIdoben(zenek_1, jelenlegiIdo, jelenlegiIdo + ketOra));
            tiltottZenek.addAll(zenekAdottIdoben(zenek_2, jelenlegiIdo, jelenlegiIdo + ketOra));
            tiltottZenek.addAll(zenekAdottIdoben(zenek_3, jelenlegiIdo, jelenlegiIdo + ketOra));
            tiltottZenek.addAll(miAdonk);

            Set<Zeneszam> lehetsegesZenek = new HashSet<>(osszesZene);
            lehetsegesZenek.removeAll(tiltottZenek);

            Zeneszam valasztottZene = lehetsegesZenek.stream().toList().get(0);
            jelenlegiIdo += valasztottZene.getSzamhossza();
            miAdonk.add(valasztottZene);

        }

        Radio r = new Radio(miAdonk);
        System.out.println(r.hanyDarabZene());
        System.out.println(r.hanyPercnyiZene());
        System.out.println();


    }

    public static List<Zeneszam> zenekAdottIdoben(List<Zeneszam> zenek, int ettol, int eddig) {

        return zenek.subList(getIndex(zenek, ettol), Math.min(getIndex(zenek, eddig) + 1, zenek.size() - 1));

    }

    public static int getIndex(List<Zeneszam> zenek, int sec) {

        int jelenlegi = 0;

        for (int i = 0; i < zenek.size(); i++) {

            if ((zenek.get(i).getSzamhossza() + jelenlegi) > sec) {
                return i;
            } else {
                jelenlegi += zenek.get(i).getSzamhossza();
            }

        }

        return -1;

    }

}
