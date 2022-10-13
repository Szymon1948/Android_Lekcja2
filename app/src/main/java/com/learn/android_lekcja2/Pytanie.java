package com.learn.android_lekcja2;

public class Pytanie {
    private String tresc;
    private boolean odpowiedz;
    private static int licznik;
    private int nr;

    public Pytanie(String tresc, boolean odpowiedz) {
        licznik++;
        this.tresc = tresc;
        this.odpowiedz = odpowiedz;
        this.nr = licznik;

    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public boolean isOdpowiedz() {
        return odpowiedz;
    }

    public void setOdpowiedz(boolean odpowiedz) {
        this.odpowiedz = odpowiedz;
    }

    public static int getLicznik() {
        return licznik;
    }

    public static void setLicznik(int licznik) {
        Pytanie.licznik = licznik;
    }

    public int getNr() {
        return nr;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
