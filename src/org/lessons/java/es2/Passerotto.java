package org.lessons.java.es2;

public class Passerotto extends Animale implements Volante {
    public void verso() {
        System.out.println("il passerotto fa: cip cip (fumate!) cip cip");
    }


    public void mangia() {
        System.out.println("Il passerotto mangia cibo per passerotti ovvero semi.");
    }

    @Override
    public void vola() {
        System.out.println("Passerotto: volo proprio come un passerotto");
    }
}
