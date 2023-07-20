package org.webler.practice_2;

import java.util.*;
import java.util.stream.Collectors;

public class Radio {

    private List<Zeneszam> zenek;
    private HashMap<String, List<Zeneszam>> zeneByEloado;

    public Radio(List<Zeneszam> zenek) {
        this.zenek = zenek;

        List<String> eloadok = zenek.stream().map(Zeneszam::getEloado).collect(Collectors.toList());

        zeneByEloado = new HashMap<>();

        for (String eloado : eloadok) {
            zeneByEloado.put(eloado, new ArrayList<>());
        }

        for (Zeneszam z : zenek) {
            zeneByEloado.get(z.getEloado()).add(z);
        }
        System.out.println();


    }

    public int hanyPercnyiZene() {
        return zenek.stream().mapToInt(Zeneszam::getSzamhossza).sum() / 60;
    }

    public int hanyDarabZene() {
        return zenek.size();
    }

    public Zeneszam leghosszabbZene() {
        return zenek.stream().max(Comparator.comparingInt(Zeneszam::getSzamhossza)).get();
    }

    public Zeneszam legrovidebbZene() {
        return zenek.stream().min(Comparator.comparingInt(Zeneszam::getSzamhossza)).get();
    }

    public String legtobbetJatszottEloado() {
        int max = 0;
        String legtobbetEloado = "";
        for (String key : zeneByEloado.keySet()) {

            if (zeneByEloado.get(key).size() > max) {
                max = zeneByEloado.get(key).size();
                legtobbetEloado = key;
            }

        }
        return legtobbetEloado;
    }

    public Zeneszam mitJatszanak(int ora, int perc) {

        int sec = ora * 3600 + perc * 60;

        int jelenlegi = 0;

        for (Zeneszam zene : zenek) {

            if ((zene.getSzamhossza() + jelenlegi) > sec) {
                return zene;
            } else {
                jelenlegi += zene.getSzamhossza();
            }

        }
        return null;
    }

    public List<Zeneszam> zenekAzEloadotol(String eloado) {
        return zeneByEloado.getOrDefault(eloado, Collections.emptyList());
    }


}
