package com.example.pc.ex5;


public class Etudiant {

    private String option;
    private String nom;
    private String email;
    private int abs;
    public Etudiant (String option,String nom,String email,int abs){
        this.option=option;
        this.nom=nom;
        this.email=email;
        this.abs=abs;
    }
    public String getNom(){
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public String getOption() {
        return option;
    }

    public int getAbs() {
        return abs;
    }

}
