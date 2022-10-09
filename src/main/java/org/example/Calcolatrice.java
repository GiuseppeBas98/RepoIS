package org.example;

public class Calcolatrice {

    private int a,b;

    public Calcolatrice(int a, int b) {
        this.a = 0;
        this.b = 0;
    }

    public int somma (int i, int j){
        return i+j;
    }

    public int sottrazione (int i, int j){
        return i-j;
    }

    public int moltiplicazione (int i, int j){
        return i*j;
    }

    public double divisione (int i, int j){
        if(j != 0){
            return i/j;
        }
        else return 0;
    }
}
