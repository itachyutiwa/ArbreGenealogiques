package com.company;

import java.util.Date;
import java.util.List;


public class NoeudPersonne {

    //Attributs
    private int idPersonne;
    String nomPersonne;
    String prenomsPersonne;
    Date dateNaissance;
    char sexePersonne;
    NoeudPersonne parent;
    List<NoeudPersonne> enfants;
    List<NoeudPersonne> freresSoeurs;

    public NoeudPersonne(int idPersonne, String nomPersonne, String prenomsPersonne, Date dateNaissance, char sexePersonne, NoeudPersonne parent) {
        this.idPersonne = idPersonne;
        this.nomPersonne = nomPersonne;
        this.prenomsPersonne = prenomsPersonne;
        this.dateNaissance = dateNaissance;
        this.sexePersonne = sexePersonne;
        this.parent = parent;
    }


    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNomPersonne() {
        return nomPersonne;
    }

    public void setNomPersonne(String nomPersonne) {
        this.nomPersonne = nomPersonne;
    }

    public String getPrenomsPersonne() {
        return prenomsPersonne;
    }

    public void setPrenomsPersonne(String prenomsPersonne) {
        this.prenomsPersonne = prenomsPersonne;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public char getSexePersonne() {
        return sexePersonne;
    }

    public void setSexePersonne(char sexePersonne) {
        this.sexePersonne = sexePersonne;
    }

    public NoeudPersonne getParent() {
        return parent;
    }

    public void setParent(NoeudPersonne parent) {
        this.parent = parent;
    }

    public List<NoeudPersonne> getEnfants() {
        return enfants;
    }

    public void setEnfants(List<NoeudPersonne> enfants) {
        this.enfants = enfants;
    }

    public List<NoeudPersonne> getFreresSoeurs() {
        return freresSoeurs;
    }

    public void setFreresSoeurs(List<NoeudPersonne> freresSoeurs) {
        this.freresSoeurs = freresSoeurs;
    }


    //Methodes
    //Affichage de l'arbre généalogique
    public void afficherArbreGenealogique(){

    }


    //Affichage la liste des enfants
    public void afficherListeEnfants(int id){

    }

    //Editer la liste des enfants
    public void editerListeEnfants(int id){

    }


    //Affichage des frères et soeurs d'une personne

    public void afficherFresSoeurs(int id){

    }



    //Affichage de cousins et cousines d'une personne
    public void afficherCousinsCousines(int id){

    }


    //Edition des ascendants d'une personne
    public void editerAscendants(int id){

    }

    //Edition du nom du frère ainés d'une personne
    public void editerFrereAine(int id){

    }

    public void editerLienParente(int id1, int id2){

    }


}
