package org.lessons.java.es1;

public class Main {
    public static void main(String[] args) {
        Animale cane = new Cane();
        Animale passerotto = new Passerotto();
        Animale aquila = new Aquila();
        Animale delfino = new Delfino();

        cane.verso();
        cane.mangia();
        cane.dormi();

        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();

        aquila.verso();
        aquila.mangia();
        aquila.dormi();

        delfino.verso();
        delfino.mangia();
        delfino.dormi();
    }
}
