package org.lessons.java.es2;

public class Aquila extends Animale implements Volante {
    public void verso() {
        System.out.println("l' Aquila fa: COK AUK COK AUK (fumate!) COK AUK COK AUK");
    }


    public void mangia() {
        System.out.println("l'Aquila mangia cibo per cani ma formato aquila ovvero semi di cane.");
    }

    @Override
    public void vola() {
        System.out.println("Aquila: KOKO si... volo perchè ho le piume");
    }
}
