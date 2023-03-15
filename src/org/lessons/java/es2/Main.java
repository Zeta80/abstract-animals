package org.lessons.java.es2;

public class Main {
    public static void faiVolare(Volante animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Animale cane = new Cane();
        Animale passerotto = new Passerotto();
        Animale aquila = new Aquila();
        Animale delfino = new Delfino();


        faiVolare((Volante)passerotto);
        faiVolare((Volante)aquila);

        faiNuotare((Nuotante)delfino);
    }
}
