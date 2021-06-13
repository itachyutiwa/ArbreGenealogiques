package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class NoeudPersonne {

    //Attributs
    private int idPersonne;
    String nomPersonne;
    String prenomsPersonne;
    String dateNaissance;
    char sexePersonne;
    NoeudPersonne parent;
    ArrayList<NoeudPersonne> enfants;
    ArrayList<NoeudPersonne> freresSoeurs;
    public static NoeudPersonne root;
    public static int nbreNoeud = 0;
    public static ArrayList<NoeudPersonne> ArbreComplet;

    public static ArrayList<NoeudPersonne> Abre = new ArrayList<NoeudPersonne>();

    //Contructeur du root
    public NoeudPersonne() {
        this.idPersonne = 0;
        this.nomPersonne = "root";
        this.prenomsPersonne = "null";
        this.dateNaissance = "01/01/vers ";
        this.sexePersonne = 'N';
        this.parent = this;
        this.enfants= new ArrayList<NoeudPersonne>() ;
        AddNoeud(this);

    }

    //Constructeur
    public NoeudPersonne(int idPersonne, String nomPersonne, String prenomsPersonne, String dateNaissance, char sexePersonne, NoeudPersonne parent) {
        if (nbreNoeud == 0) {
            //creation du root s'il nexiste pas
            creationRoot();
            nbreNoeud++;

            //et creation de l'objet
            this.idPersonne = idPersonne;
            this.nomPersonne = nomPersonne;
            this.prenomsPersonne = prenomsPersonne;
            this.dateNaissance = dateNaissance;
            this.sexePersonne = sexePersonne;
            this.enfants=new ArrayList<NoeudPersonne>();
            this.freresSoeurs=new ArrayList<NoeudPersonne>();
            if (parent == null) {
                this.parent = root;
                AjoutAListeDenfants(this.parent, this);
                AjoutFreresSoeurs(this.parent,this);
            } else {
                this.parent = parent;
                AjoutAListeDenfants(this.parent,this);
                AjoutFreresSoeurs(this.parent,this);
            }

        } else {
            this.idPersonne = idPersonne;
            this.nomPersonne = nomPersonne;
            this.prenomsPersonne = prenomsPersonne;
            this.dateNaissance = dateNaissance;
            this.sexePersonne = sexePersonne;
            this.enfants=new ArrayList<NoeudPersonne>();
            this.freresSoeurs=new ArrayList<NoeudPersonne>();
            //System.out.print(parent+"\n");
            if (parent == null) {
                this.parent = root;
                AjoutAListeDenfants(this.parent,this);
                AjoutFreresSoeurs(this.parent,this);
            } else {
                this.parent = parent;
                AjoutAListeDenfants(this.parent,this);
                AjoutFreresSoeurs(this.parent,this);
            }
            nbreNoeud++;
        }
        AddNoeud(this);
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


    //Les methodes
    //Affichage de l'arbre généalogique
    public void afficherArbreGenealogique() {

    }


    //Affichage la liste des enfants
    public void afficherListeEnfants(int id) {

    }

    //Editer la liste des enfants
    public void editerListeEnfants(int id) {

    }


    //Affichage des frères et soeurs d'une personne

    public void afficherFresSoeurs(int id) {

    }


    //Affichage de cousins et cousines d'une personne
    public void afficherCousinsCousines(int id) {

    }


    //Edition des ascendants d'une personne
    public void editerAscendants(int id) {

    }

    //Edition du nom du frère ainés d'une personne
    public void editerFrereAine(int id) {

    }

    public void editerLienParente(int id1, int id2) {

    }

    public void creationRoot() {
        root = new NoeudPersonne();
    }

    public void AfficherNoeud() {
        System.out.println("id :" + this.getIdPersonne() + "\n nom :" + this.getNomPersonne() + " \n prenom :" + this.getPrenomsPersonne() + "\n sexe :" + this.getSexePersonne() + "\n date naissance: " + this.getDateNaissance() + "\n parent :" + getParent().getNomPersonne());
    }

    public void AddNoeud(NoeudPersonne n) {
        Abre.add(n);
    }

    public void AjoutAListeDenfants(NoeudPersonne pere, NoeudPersonne enf) {
        Abre.forEach((n)->{
            if(n==pere){
               System.out.println(enf.getNomPersonne()+" "+n.getNomPersonne());
               n.enfants.add(enf);
            }
        });
       //parent.enfants.add(enf);
    }

    public void AjoutFreresSoeurs(NoeudPersonne pere, NoeudPersonne enf) {
        Abre.forEach((n)->{
            if(n==pere){
               // System.out.println(enf.getNomPersonne()+" "+n.getNomPersonne());
                n.enfants.forEach((m)->{
                    if(m!=enf){
                        m.freresSoeurs.add(enf);
                        enf.freresSoeurs.add(m);
                    }

                });
            }
        });
    }
    public void AfiichageCousin(){
        if(this.parent.getIdPersonne()==0){
            System.out.println("Pas de cousin");
        }else if(this.getIdPersonne()==0){
            System.out.println("pas de cousin");
        }else{
            NoeudPersonne grandPere=this.parent.parent;
            NoeudPersonne papa =this.parent;
            Abre.forEach((n)->{
                if(n==grandPere){
                    // System.out.println(enf.getNomPersonne()+" "+n.getNomPersonne());
                    n.enfants.forEach((m)->{
                        if(m!=papa){
                            m.enfants.forEach((p)->System.out.println(p.getNomPersonne()));
                        }
                    });
                }
            });

        }
    }
    public void descendantPersonne(){
        NoeudPersonne personne=this;
        if(personne.enfants.isEmpty()){
            System.out.println("pas de descendant");
        }else{
            personne.enfants.forEach((n)->
                    {
                        System.out.println(n.getNomPersonne());
                        if(!(n.enfants.isEmpty())){
                            n.descendantPersonne();
                        }
                   }
            );

        }
    }

    public void ascendantPersonne(){
        NoeudPersonne personne=this;
        if(personne.parent.getIdPersonne()==0){
            System.out.println("root ");
        }else{
            System.out.println(personne.parent.getNomPersonne());
            personne.parent.AfiichageCousin();
            personne.parent.freresSoeurs.forEach((n)->
                    {
                        System.out.println(n.getNomPersonne());
                    }
                     );
            personne.parent.ascendantPersonne();


        }
    }
    public void frereAine(){

        NoeudPersonne personne=this;
        Abre.forEach((n)->{
            if(n==personne) {
                if (!(n.freresSoeurs).isEmpty()) {
                    System.out.println(n.freresSoeurs.get(0).getNomPersonne());
                }else{
                    System.out.println("pas de freres ni de soeur");
                }
            }
        });
    }
}
