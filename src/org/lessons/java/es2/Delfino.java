package org.lessons.java.es2;

public class Delfino extends Animale implements Nuotante{
    public void verso() {
        System.out.println("il delfino piccolino fa: KIKIKIII (fumate!) KIKIKIKIII");
    }


    public void mangia() {
        System.out.println("il delfino che è ancora piccolino mangia pesce palla");
    }

    @Override
    public void nuota() {
        System.out.println("Delfino: KIKIII swimm swimm nuoto");
    }
}
