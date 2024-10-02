package com.example;

public class Cestino {
    int valore = 0;
    public Cestino(int i) {
        valore = i;
    }
    public int getValore() {
        return valore;
    }
    public void setValore(int valore) {
        this.valore = valore;
    }

    public void incrementa() {
        valore++;
        System.out.println("test");
    }
    
}
