package com.example.houssem_feki_mesure_glycemie.controller;

import com.example.houssem_feki_mesure_glycemie.model.Patient;

public final class Controller {
    //L'attribut statique “instance” de type Controller, joue le rôle du singleton de la classe.
    private static Controller instance = null;
   //Le Constructeur par défaut
    private Controller() {
        super();
    }
   //L’attribut de la classe Patient
    private static Patient patient;
   // Méthode createPatient initialise le modèle par les propriétés d’un patient donné par l’utilisateur.
    public void createPatient(int age, float valeur, boolean fasting, boolean isFasting) {
        patient = new Patient(age, valeur, isFasting);
    }

    //Update Controller -> View
    //La méthode getResponse() retourne le résultat de l’analyse du niveau de glycémie.
    public String getRes() {
        return patient.getRes();//Update Patient -> Controller
    }
    //La méthode statique et finale “getInstance()” qui est responsable à la création d'une seule instance de la classe Controller.
    public static Controller getInstance() {
        if (Controller.instance == null)
            Controller.instance = new Controller();
        return Controller.instance;
    }
}

