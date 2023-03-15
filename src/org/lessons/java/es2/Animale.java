package org.lessons.java.es2;

abstract class Animale {
    public void dormi(){
        System.out.println("Il " + this.getClass().getSimpleName() + " va a dormire... ZzZzZzZ. SILENZIO!");
    }
    public abstract void verso();


    public abstract void mangia();
}
