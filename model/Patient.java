package com.example.houssem_feki_mesure_glycemie.model;

import android.view.View;

public class Patient {
    //Les attributs de la classe Patient
    private int age;
    private float valeur;
    private boolean isFasting;
    private String res;
    //Notify controle -> Model
    //Le Constructeur
    public Patient(int age, float valeur, boolean isFasing) {
        this.age = age;
        this.valeur = valeur;
        this.isFasting = isFasing;
        calculer();
    }
    //Les getters et Les setters
    public int getAge() {
        return age;
    }
    public float getValeur() {
        return valeur;
    }
    public boolean isFasting() {
        return isFasting;
    }
    //Update Model -> Control
    public String getRes(){
        return res;
    }
    //Méthode Calculer qui analyse le niveau de glycémie
    private void calculer() {

            if (isFasting) {
                if (age >= 13) {
                    if (valeur< 5)
                         res="Niveau de glycémie est bas";
                    else if (valeur >= 5 && valeur <= 7.2)
                         res="Niveau de glycémie est normale";
                    else
                        res="Niveau de glycémie est élevé";
                } else if (age >= 6 && age <= 12) {
                    if (valeur < 5)
                        res="Niveau de glycémie est bas";
                    else if (valeur>= 5 && valeur <= 10)
                        res="Niveau de glycémie est normale";
                    else
                        res="Niveau de glycémie est élevé";
                } else if (age < 6) {
                    if (valeur < 5.5)
                        res="Niveau de glycémie est bas";
                    else if (valeur >= 55 && valeur <= 10.0)
                       res="Niveau de glycémie est normale";
                    else
                       res="Niveau de glycémie est élevé ";
                } else {
                    //false
                    if (valeur > 10.5)
                        res="Niveau de glycémie est élevé ";
                    else
                        res="Niveau de glycémie est normale ";
                }
            }
        }
    }





