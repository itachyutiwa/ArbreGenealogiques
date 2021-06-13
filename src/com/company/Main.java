package com.company;
//import com.google.gson.*;
import java.util.ArrayList;

public class Main {


    public static <JSONArray> void main(String[] args) {

	// write your code here
           NoeudPersonne a=new NoeudPersonne(1,"CAMARA","Michel","12/05/1995",'M',null);
           NoeudPersonne b=new NoeudPersonne(2,"KONE","GOMPOU","12/05/1995",'M',a);
           NoeudPersonne c=new NoeudPersonne(3,"Kama","GOMPOU","12/05/1995",'M',a);
           NoeudPersonne d=new NoeudPersonne(4,"GOORER","BI","12/05/1995",'M',a);
           NoeudPersonne f=new NoeudPersonne(5,"Marck","konan","12/05/1995",'M',null);
           NoeudPersonne g=new NoeudPersonne(5,"estelle","kouassi","12/05/1995",'M',f);
           NoeudPersonne h=new NoeudPersonne(5,"jean","mamy","12/05/1995",'M',g);
           NoeudPersonne i=new NoeudPersonne(5,"steph","dal","12/05/1995",'M',g);
           NoeudPersonne j=new NoeudPersonne(5,"harry","kouassi","12/05/1995",'M',i);
           NoeudPersonne k=new NoeudPersonne(5,"silvestre","ali","12/05/1995",'M',c);


            System.out.println("-----------Nombre de noeud crée------------------------------------------");
            System.out.println(NoeudPersonne.nbreNoeud+" noeuds et le root donc au total "+(NoeudPersonne.nbreNoeud+1)+" noeuds\n");
            System.out.println("------------------------------------------------------------------------- \n");
            System.out.println("---------------Affichage complet de notre arbre généalogique-------------");
            NoeudPersonne.Abre.forEach((n)->n.AfficherNoeud());


        System.out.println("---------------Affichage de la liste des enfants d'une personne-------------");
            a.enfants.forEach((n)->System.out.println(n.getNomPersonne()));

        System.out.println("---------------Affichage de la liste des freres et soeurs d'une personne-------------");
            System.out.println(d.getNomPersonne()+" a pour frere et soeur :\n");
            d.freresSoeurs.forEach((n)->System.out.println(n.getNomPersonne()));
        System.out.println(f.getNomPersonne()+" a pour frere et soeur :\n");
            f.freresSoeurs.forEach((n)->System.out.println(n.getNomPersonne()));

        System.out.println("---------------Affichage de la liste des cousin et cousine d'une personne -------------");
        g.AfiichageCousin();


        System.out.println("---------------Affichage de la liste des descendant d'une personne-------------");
        j.descendantPersonne();

        System.out.println("Descendant du root ");
        NoeudPersonne.Abre.forEach((n)->{
            if(n.getIdPersonne()==0){
                n.descendantPersonne();
            }
        });

        System.out.println("---------------Affichage de la liste des ascendant d'une personne-------------");
        h.ascendantPersonne();

        System.out.println("---------------Affichage de frere ainé d'une personne -------------");
        d.frereAine();

        j.frereAine();

        //System.out.println("JsonAraay::"+JSON);
        //String json=new json().toJson(NoeudPersonne.Abre);
        //String Json= new GsonBuilder
        //String arraytoJson = ObjectMapper.writeValueAsString(NoeudPersonne.Abre);
        //JSONArray jsArray = new JSONArray(list);
    }
}
