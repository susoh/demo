package com.example;

public class Main {
    public static void main(String[] args) {
        Cestino c1 = new Cestino(0);
        Deposito d1 = new Deposito(c1, 1000);
        Deposito d2 = new Deposito(c1, 1000);
        d1.start();
        d2.start();
        try {
            d1.join();
            d2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(c1.getValore());
    }
} 