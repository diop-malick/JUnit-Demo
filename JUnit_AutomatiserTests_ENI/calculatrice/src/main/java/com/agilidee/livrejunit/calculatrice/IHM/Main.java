package com.agilidee.livrejunit.calculatrice.IHM;

public class Main {
    public static void main(String[] args) {
        Modele modele = new Modele();
        Vue vue = new Vue();
        @SuppressWarnings("unused")
		Controleur controleur = new Controleur(vue, modele);
        vue.pack();
        vue.setVisible(true);
    }
}
