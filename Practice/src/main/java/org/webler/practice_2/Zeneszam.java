package org.webler.practice_2;

import java.util.Objects;

public class Zeneszam {

    private String eloado;
    private String szamCime;
    private int szamhossza;

    public Zeneszam(String eloado, String szamCime, int szamhossza) {
        this.eloado = eloado;
        this.szamCime = szamCime;
        this.szamhossza = szamhossza;
    }

    public String getEloado() {
        return eloado;
    }

    public String getSzamCime() {
        return szamCime;
    }

    public int getSzamhossza() {
        return szamhossza;
    }

    @Override
    public String toString() {
        return "Zeneszam{" +
                "eloado='" + eloado + '\'' +
                ", szamCime='" + szamCime + '\'' +
                ", szamhossza=" + szamhossza +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zeneszam zeneszam = (Zeneszam) o;
        return szamhossza == zeneszam.szamhossza && Objects.equals(eloado, zeneszam.eloado) && Objects.equals(szamCime, zeneszam.szamCime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eloado, szamCime, szamhossza);
    }
}
