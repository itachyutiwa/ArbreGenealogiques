package com.company;

//import com.sun.deploy.nativesandbox.NativeSandboxOutputStream;

import java.io.*;
import java.util.ArrayList;

public class NoeudPersonne implements Serializable{
    //Attributs
    public int idPersonne;
    String nomPersonne;
    String prenomsPersonne;
    String dateNaissance;
    String sexePersonne;
    NoeudPersonne parent;
    ArrayList<NoeudPersonne> enfants;
    ArrayList<NoeudPersonne> freresSoeurs;
    public static NoeudPersonne root;

    public NoeudPersonne(int idPersonne, String nomPersonne, String prenomsPersonne, String dateNaissance, String sexePersonne, NoeudPersonne parent) {
        if (idPersonne== 0) {
            //creation du root s'il nexiste pas
            this.idPersonne = 0;
            this.nomPersonne = nomPersonne;
            this.prenomsPersonne = prenomsPersonne;
            this.dateNaissance = dateNaissance;
            this.sexePersonne = sexePersonne;
            this.enfants=new ArrayList<NoeudPersonne>();
            this.freresSoeurs=new ArrayList<NoeudPersonne>();
            this.parent = this;
            this.freresSoeurs=new ArrayList<NoeudPersonne>();
        } else {
            this.idPersonne = idPersonne;
            this.nomPersonne = nomPersonne;
            this.prenomsPersonne = prenomsPersonne;
            this.dateNaissance = dateNaissance;
            this.sexePersonne = sexePersonne;
            this.enfants=new ArrayList<NoeudPersonne>();
            this.freresSoeurs=new ArrayList<NoeudPersonne>();
            if (parent == null) {
                this.parent = parent;
                //AjoutAListeDenfants(this.parent,this);
                //AjoutFreresSoeurs(this.parent,this);
            } else {
                this.parent = parent;
                //AjoutAListeDenfants(this.parent,this);
                //AjoutFreresSoeurs(this.parent,this);
            }
        }
    }
    public void EditionEnfant(){

    }



    //Les getters et les setters
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

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getSexePersonne() {
        return sexePersonne;
    }

    public void setSexePersonne(String sexePersonne) {
        this.sexePersonne = sexePersonne;
    }

    public NoeudPersonne getParent() {
        return parent;
    }

    public void setParent(NoeudPersonne parent) {
        this.parent = parent;
    }

    public ArrayList<NoeudPersonne> getEnfants() {
        return enfants;
    }

    public void setEnfants(ArrayList<NoeudPersonne> enfants) {
        this.enfants = enfants;
    }

    public ArrayList<NoeudPersonne> getFreresSoeurs() {
        return freresSoeurs;
    }

    public void setFreresSoeurs(ArrayList<NoeudPersonne> freresSoeurs) {
        this.freresSoeurs = freresSoeurs;
    }

    public void Ascendant(){

    };
    public void Aine(NoeudPersonne a){

    }

    public static void frereSoeur(){

    }
    public void ascendant(){


    }
    public void descendant(){


    }

    public void frereAine(){
        if (!(this.freresSoeurs).isEmpty()) {
            System.out.println("A pour frere aine : "+this.freresSoeurs.get(0).getNomPersonne()+" "+this.freresSoeurs.get(0).getPrenomsPersonne());
        }else {
            System.out.println("pas de freres ni de soeur");
        }
    }


    public void AfiichageCousin(){
        if(this.parent.getIdPersonne()==0) {
            System.out.println("Pas de cousin");
        }else if(this.parent.getIdPersonne()==0) {
            System.out.println("Pas de cousin");
        }else if(this.getParent().getFreresSoeurs().isEmpty()){
            System.out.println("Pas de cousin");
        }
        else if(this.getIdPersonne()==0){
            System.out.println("pas de cousin");
        }else{
            NoeudPersonne grandPere=this.parent.parent;
            grandPere.getEnfants().forEach((m)-> {
                if (m.getIdPersonne() != this.getParent().getIdPersonne()){
                    if(m.getEnfants()==null){
                        System.out.println(this.getNomPersonne()+" n'a pas de cousin");
                    }else{
                        m.getEnfants().forEach((p) -> {
                            if (p.getIdPersonne() != this.getIdPersonne()) {
                                System.out.println("           id : " + p.getIdPersonne() + " Nom : " + p.getNomPersonne() + " Prenom : " + p.getPrenomsPersonne());
                            }
                        });
                    }
                }
            });
        }
    }

    public void AfiichageCousinExistant(){
        if(this.parent.getIdPersonne()==0){

        }else if(this.getIdPersonne()==0){

        }else{
            NoeudPersonne grandPere=this.parent.parent;
            grandPere.getEnfants().forEach((m)-> {
                if (m.getIdPersonne() != this.getParent().getIdPersonne()){
                    if(m.getEnfants()==null){
                    }else{
                        m.getEnfants().forEach((p) -> {
                            if (p.getIdPersonne() != this.getIdPersonne()) {
                                System.out.println("             code :"+p.getIdPersonne() + "  " + p.getNomPersonne() + "   " + p.getNomPersonne());
                            }
                        });
                    }
                }
            });
        }
    }

    public void ListeCousinVerification(NoeudPersonne b){
        if(this.parent.getIdPersonne()==0){

        }else if(this.getIdPersonne()==0){

        }else{
            NoeudPersonne grandPere=this.parent.parent;
            grandPere.getEnfants().forEach((m)-> {
                if (m.getIdPersonne() != this.getParent().getIdPersonne()){
                    if(m.getEnfants()==null){

                    }else{
                        m.getEnfants().forEach((p) -> {
                            if (p.getIdPersonne() != this.getIdPersonne()) {
                                if(p==b){
                                    System.out.println("oui");
                                }
                            }
                        });
                    }
                }
            });
        }
    }


    public void ascendantPersonne(){
        if(this.parent.getIdPersonne()==0){
            System.out.println("  root ");
        }else{
            System.out.println("  Code : "+this.parent.getIdPersonne()+"   "+this.parent.getNomPersonne()+"  "+this.parent.getPrenomsPersonne());
            //this.parent.AfiichageCousinExistant();
            this.parent.freresSoeurs.forEach((n)->
                    {
                        System.out.println("           Code : "+n.getIdPersonne()+"   "+n.getNomPersonne()+"   "+n.getPrenomsPersonne());
                    }
            );
            this.parent.ascendantPersonne();
        }
    }

    static public String r="";
/*
    public void AffichageEnfant(){
        if(this.getEnfants()==null){
            System.out.println("");
        }else{
            this.getEnfants().forEach((n)->
                    {
                        System.out.println("Code : "+n.getIdPersonne()+"   "+n.getNomPersonne()+"   "+n.getPrenomsPersonne());
                    }
            );
        }
    }
*/
    public void AffichageGraphe(){
        if(this.getEnfants()==null){
            System.out.println(" ");
        }else{
            this.getEnfants().forEach((n)->
                    {
                        r=r+" ++++++ ";
                        System.out.println("Code : "+n.getIdPersonne()+"   "+n.getNomPersonne()+"   "+n.getPrenomsPersonne());
                        n.AffichageGraphe();
                    }

            );
        }
        r="";


    }

    public void RechercheLien(NoeudPersonne b){
        if(this.getParent()==b){
            System.out.println(this.getNomPersonne()+" "+this.getPrenomsPersonne()+"  est le fils ou la fille de : "+b.getNomPersonne()+" "+b.getPrenomsPersonne());
        }else if((this.getFreresSoeurs().contains(b))){
            System.out.println((this.getNomPersonne()+" "+this.getPrenomsPersonne()+"  est le frère ou la soeur de : "+b.getNomPersonne()+" "+b.getPrenomsPersonne()));
        }else if((this.getEnfants().contains(b))){
            System.out.println(this.getNomPersonne()+" "+this.getPrenomsPersonne()+"  est le père ou la mere de : "+b.getNomPersonne()+" "+b.getPrenomsPersonne());
        }else if(b.getParent()==this){
            System.out.println(b.getNomPersonne()+" "+b.getPrenomsPersonne()+"  est le fils ou la fille de : "+this.getNomPersonne()+" "+this.getPrenomsPersonne());
        }else if((this.getEnfants().contains(b))){
            System.out.println(b.getNomPersonne()+" "+b.getPrenomsPersonne()+"  est le père de ou la mere : "+this.getNomPersonne()+" "+this.getPrenomsPersonne());
        }else if(this.getParent().getParent()==b.getParent().getParent()){
            System.out.println(b.getNomPersonne()+" "+b.getPrenomsPersonne()+"  est le cousin ou la cousine de : "+this.getNomPersonne()+" "+this.getPrenomsPersonne());
        }else if(this.getParent().getParent()==b){
            System.out.println(b.getNomPersonne()+" "+b.getPrenomsPersonne()+"  est le grand père ou la grande mère de : "+this.getNomPersonne()+" "+this.getPrenomsPersonne());
        }else if(b.getParent().getParent()==this){
            System.out.println(this.getNomPersonne()+" "+this.getPrenomsPersonne()+"  est le grand père ou la grande mère de : "+b.getNomPersonne()+" "+b.getPrenomsPersonne());
        }else if((b.getParent().getFreresSoeurs().contains(this.getParent())) ){
            System.out.println(this.getNomPersonne()+" "+this.getPrenomsPersonne()+"  est le neuveu ou la nièce de : "+b.getNomPersonne()+" "+b.getPrenomsPersonne());
        }else if(!(this.getParent().getFreresSoeurs().contains(b.getParent())) ){
            System.out.println(b.getNomPersonne()+" "+b.getPrenomsPersonne()+"  est le neuveu ou la nièce de : "+this.getNomPersonne()+" "+this.getPrenomsPersonne());
        }else{
            System.out.println("Le lien entre  "+b.getNomPersonne()+" "+b.getPrenomsPersonne()+" et "+this.getNomPersonne()+" "+this.getPrenomsPersonne()+" est un lien lointain");
        }

    }

}

