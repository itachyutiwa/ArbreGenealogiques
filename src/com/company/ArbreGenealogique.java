package com.company;
import java.io.*;
import java.util.ArrayList;

class AbreGenealogique implements Serializable {
    public ArrayList<NoeudPersonne> Arbre = new ArrayList<>();

    public int nombreDeNoeud(){
        return this.Arbre.size();
    }

    public void CreerPersonne(int idPersonne, String nomPersonne, String prenomsPersonne, String dateNaissance, String sexePersonne, NoeudPersonne parent) {
        //NoeudPersonne chercher =RechercheParId(6,this.Arbre);
        NoeudPersonne b=new NoeudPersonne(this.nombreDeNoeud(),nomPersonne,prenomsPersonne,dateNaissance,sexePersonne,parent);
        Arbre.add(b);
        if(this.nombreDeNoeud()!=1) {
            b.getParent().getEnfants().add(b);
            AjoutFreresSoeurs(b.getParent(), b);
        }
        serialisation();

    }

    public void AjoutFreresSoeurs(NoeudPersonne pere, NoeudPersonne enf) {
        Arbre.forEach((n)->{
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

    public NoeudPersonne RechercheParId(Integer name, ArrayList<NoeudPersonne> a) {
        for (NoeudPersonne n : a) {
            if (n.getIdPersonne()==(name)) {
                return n;
            }
        }
        return NoeudPersonne.root;
    }

    public NoeudPersonne rechercherParCode(Integer name,ArrayList<NoeudPersonne> a) {
        for(NoeudPersonne member : a) {
            if (member.getIdPersonne()==name ) {
                return member;
            }
        }
        return null;
    }
    public NoeudPersonne rechercherFilsPersonne(int a,NoeudPersonne b){
        for(NoeudPersonne l: b.enfants){
            if(l.getIdPersonne()==a){
                return l;
            }
        }
        return null;
    }







    public void serialisation(){
        try
        {
            FileOutputStream fos = new FileOutputStream("ArbreGenealogique.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.close();
            fos.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public static AbreGenealogique deserialiseation(){
        AbreGenealogique A2 =new AbreGenealogique();

        try {
            FileInputStream fis = new FileInputStream("ArbreGenealogique.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            A2=(AbreGenealogique)ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException ioe) {
            System.out.println("Imposible de lire");
            return  A2;
        }
        return A2;
    }

    public void Affichage(){
        Arbre.forEach((n)->System.out.println("id: "+n.getIdPersonne()+",  Nom et prenoms : "+n.getNomPersonne()+" "+n.getPrenomsPersonne()+", Sexe :"+n.getSexePersonne()+", Date de naissance :"+n.getDateNaissance()+",   Parent: "+n.getParent().getNomPersonne()+" "+n.getParent().getPrenomsPersonne()));
    }






}
