package com.agilidee.livrejunit.calculatrice.math;

public class Addition implements Operation{
    public Long calculer(Long a, Long b) {
        return a+b;
    }
    public Character lireSymbole() {
        return '+';
    }
}