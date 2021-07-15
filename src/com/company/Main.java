package com.company;
//import com.google.gson.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {



System.out.print("CHARGEMENT");
Charg();
Thread.sleep(600);

System.out.println("\n");
System.out.println("\n");
Thread.sleep(15);
System.out.println("*******************************************************************************************************************+" );
        Thread.sleep(600,400);
System.out.println("====================================================================================================================" );
        Thread.sleep(500,400);
System.out.println("===========================SOYEZ LES BIENVENUES DANS NOTRE PROGRAMME D'ABRE GENEALOGIQUE ===========================" );
        Thread.sleep(500,400);
System.out.println("====================================================================================================================" );
        Thread.sleep(500,400);
System.out.println("*   +___________________________________________________________@@_________________________________________________*");
System.out.println("*   |                                                           ][                                                 *");
System.out.println("*   |  PROJET  DE FIN DE SEMESTRE 02  : JAVA                    ][  Réalisé par:                                   *");
System.out.println("*   |  ---------------------------------------------------------][  -----------------------------------------------*");
System.out.println("*   |  =========================================================][=================================================*");
System.out.println("*   |  Professeur Bi Tra GOORE                                  ][ KONE GOMPOU LOUA ALASSANE                       *");
System.out.println("*   |  Maître de Conférences, Docteur Ingénieur en Informatique ][                                                 *");
System.out.println("*   |  Institut National Polytechnique Félix Houphouët Boigny   ][ CAMARA MICHEL                                   *");
System.out.println("*   |  Yamoussoukro – Côte d’Ivoire                             ][                                                 *");
System.out.println("*   |  bitra.goore@inphb.ci - (+225) 58 50 13 04                ][ KANGA OI KANGA PIERRE STEPHANE                  *");
System.out.println("*   |  =========================================================][=================================================*");
System.out.println("*   +___________________________________________________________@@_________________________________________________*");
System.out.println("********************************************************************************************************************");
        Thread.sleep(600,400);
        AbreGenealogique A0 = new AbreGenealogique();
        AbreGenealogique A1 = new AbreGenealogique().deserialiseation();


        Scanner scanner = new Scanner(System.in);
        boolean yes = true;

        Thread.sleep(15);
        System.out.print("Nombre de personne dans l'arbre genealogiaue :");
        System.out.println(A1.nombreDeNoeud());
        Thread.sleep(600,400);
        do {
System.out.println("********************************************************************************************************************");
System.out.println("*   +_______________________________________________MENU____PRINCIAL_______________________________________________+");
System.out.println("*   |                                                                                                              *");
System.out.println("*   |                                1.Créer un arbre généalogique                                                 *");
System.out.println("*   |                                2.Afficher l'arbre généalogique                                               *");
System.out.println("*   |                                3.Edition de la liste des enfants d'une personne                              *");
System.out.println("*   |                                4.Afficher les frères et soeurs d'une personne                                *");
System.out.println("*   |                                5.Afficher les cousins d'une personne                                         *");
System.out.println("*   |                                6.Edition des acsendants d'une personne                                       *");
System.out.println("*   |                                7.Edition du nom du frère ainé d'une personne                                 *");
System.out.println("*   |                                8.Edition du lien de parenté d'une personne                                   *");
System.out.println("*   |                                9.Recherche d'une personne par Son numero Identifiant                         *");
System.out.println("*   |                                10.Quitter l'Application                                                      *");
System.out.println("*   +______________________________________________________________________________________________________________*");
System.out.println("********************************************************************************************************************");

int choice = 0;
            Scanner m=new Scanner(System.in);
            boolean trouv;
System.out.println("*                                           Faites votre choix::                                                   *");
            do{
                try {
                    choice = m.nextInt();
                    trouv=true;
                } catch(Exception e){
                    System.out.println("saisir une valeur entiere");
                    trouv=false;
                    m.next();
                }
            }while (!trouv);


System.out.println("+******************************************************************************************************************+");

switch (choice) {
                case 1:
                    try {
System.out.println("*********************************************************************************************************************");
System.out.println("---------------------------------------------------------------------------------------------------------------------");
System.out.println("+*******************************|ENREGISTREMENT D'UN ARBRE GENEALOGIQUE|*********************************************");


String noms="";
Scanner rs= new Scanner(System.in);
do {
System.out.println("*                                           Entrez nom :                                                           *");
noms = rs.nextLine();
} while (noms.equals(""));

System.out.println("*                                                                                                                  *");
System.out.println("+******************************************************************************************************************+");
System.out.println("********************************************************************************************************************");



String prenoms="";
Scanner rs1= new Scanner(System.in);
do {
System.out.println("*                                         Entrez prenoms :                                                         *");
prenoms = rs1.nextLine();
} while (prenoms.equals(""));

System.out.println("*                                                                                                                  *");
System.out.println("+******************************************************************************************************************+");
System.out.println("********************************************************************************************************************");


String dateNaiss="";
Scanner rs2= new Scanner(System.in);
do {
System.out.println("*                                    Entrez date naissance jj/mm/aaaa :                                            *");
    dateNaiss = rs2.nextLine();
} while (dateNaiss.equals(""));


System.out.println("*                                                                                                                  *");
System.out.println("+******************************************************************************************************************+");


String sexe="";
Scanner rs3= new Scanner(System.in);
do {
System.out.println("********************************************************************************************************************");
System.out.println("*                                             Entrez sexe M/F:                                                     *");
sexe = rs3.nextLine();
} while (sexe.equals(""));


System.out.println("*                                                                                                                   *");
System.out.println("+*******************************************************************************************************************+");
System.out.println("*********************************************************************************************************************");
A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom :"+personne.getNomPersonne()+" Prenom : "+personne.getPrenomsPersonne()));



Scanner rec4=new Scanner(System.in);
int idParent = 0;
boolean trouve;
System.out.println("*                                          Entrez identifiant parent(Ex: 5)                                          *");
do{
try {
idParent = rec4.nextInt();
trouve=true;
} catch(Exception e){
System.out.println("Saisir une valeur entiere");
trouve=false;
rec4.next();
}
}while (!trouve);


A1.CreerPersonne(1,noms, prenoms,dateNaiss,sexe,A1.RechercheParId(idParent,A1.Arbre));
                        Main.cleanConsole();
System.out.println("*                                                                                                                                                                                                   *");
System.out.println("+*******************************************************************************************************************+");
                    } catch (Exception e) {
                                      System.out.println("Entrez un entier uniquement");
                        System.out.println(e.getMessage());
                        Main.cleanConsole();
                    }
                    break;

                case 2:
                    try {
System.out.println("=====================================================================================================================");
System.out.println("---------------------------------------------------------------------------------------------------------------------");
System.out.println("+*************************************|AFFICHAGE DE L'ABRE GENEALOGIQUE|********************************************+");
System.out.println("---------------------------------------------------------------------------------------------------------------------");

Main.cleanConsole();
A1 = new AbreGenealogique().deserialiseation();
A1.Affichage();
NoeudPersonne r= A0.rechercherParCode(0,A1.Arbre);
System.out.println("+*************************************|AFFICHAGE DE L'ABRE GENEALOGIQUE|********************************************+");

System.out.println("=====================================================================================================================");
                        System.out.println("\n");

                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;


                case 3:
                    Main.cleanConsole();
                    try {
                        A1 = new AbreGenealogique().deserialiseation();
                        A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom :"+personne.getNomPersonne()+" Prenom : "+personne.getPrenomsPersonne()));
                        Scanner rec=new Scanner(System.in);
                        int codeP = 0;
                        boolean trouve;
                        System.out.println("Veuillez saisir le code de la personne dont vous chercher l'enfant");
                        do{
                            try {
                                codeP = rec.nextInt();
                                trouve=true;
                            } catch(Exception e){
                                System.out.println("saisir une valeur entiere");
                                trouve=false;
                                rec.next();
                            }
                        }while (!trouve);

                        NoeudPersonne rechercher= A1.rechercherParCode(codeP,A1.Arbre);
                        if(rechercher!=null){
                            System.out.println("Le nom de la personne retrouvee est : "+rechercher.getNomPersonne()+",  le prenom : "+rechercher.getPrenomsPersonne());
                            if(rechercher.getEnfants().size()<1){
                                System.out.println(rechercher.getNomPersonne()+"  "+rechercher.getPrenomsPersonne()+" n'a pas d'enfant");
                            }else{
                                String s="";
                                if(!(rechercher.getEnfants().size()==1)){
                                    s="s";
                                }else{
                                    s="";
                                }
                                System.out.print(" Il a :"+rechercher.getEnfants().size()+" enfant(s)"+s+" ");

                                System.out.println("La liste des enfants de "+rechercher.getNomPersonne()+" "+rechercher.getPrenomsPersonne());
                                rechercher.enfants.forEach((n)->{
                                    System.out.println("         id : "+n.getIdPersonne()+" Nom et Prenom: "+n.getNomPersonne()+"  "+n.getPrenomsPersonne());
                                });
                            }
                        }else{
                            System.out.println(" La personne que vous chercher son n'enfant n'existe pas " );
                        }

                    } catch (Exception e) {
                        System.out.println("Entrez un entier uniquement");
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    Main.cleanConsole();
                    try {
                        A1 = new AbreGenealogique().deserialiseation();
                        A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom :"+personne.getNomPersonne()+" Prenom : "+personne.getPrenomsPersonne()));

                        Scanner rec2=new Scanner(System.in);
                        int codeP2 = 0;
                        boolean trouve2;

                        System.out.println("Veuillez saisir le code de la personne dont vous voulez afficher les freres et soeurs");
                        do{
                            try {
                                codeP2 = rec2.nextInt();
                                trouve2=true;
                            } catch(Exception e){
                                System.out.println("Saisir une valeur entiere");
                                trouve2=false;
                                rec2.next();
                            }
                        }while (!trouve2);

                        NoeudPersonne rechercher2= A1.rechercherParCode(codeP2,A1.Arbre);
                        if(rechercher2!=null){
                            System.out.println("Le nom de la personne retrouvee est : "+rechercher2.getNomPersonne()+",  le prenom : "+rechercher2.getPrenomsPersonne());
                            if(rechercher2.getFreresSoeurs().size()<1){
                                System.out.println(rechercher2.getNomPersonne()+" n'a pas de freres/ soeurs");
                            }else{
                                System.out.println("La liste des freres de "+rechercher2.getNomPersonne());
                                rechercher2.getFreresSoeurs().forEach((n)->{
                                    System.out.println("           id : "+n.getIdPersonne()+" Nom et Prenoms: "+n.getNomPersonne()+" "+n.getNomPersonne());
                                });
                            }
                        }else{
                            System.out.println(" Personne inexistante " );
                        }
                } catch (Exception e) {
                        System.out.println("Entrez un entier uniquement");
                    System.out.println(e.getMessage());
                }
                break;

                case 5:
                    Main.cleanConsole();
                    try {
                        A1 = new AbreGenealogique().deserialiseation();
                        A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom :"+personne.getNomPersonne()+" Prenom : "+personne.getPrenomsPersonne()));

                        Scanner rec3=new Scanner(System.in);
                        int codeP3 = 0;
                        boolean trouve3;

                        System.out.println("Veuillez saisir le code de la personne dont vous devez afficher ses cousins");
                        do{
                            try {
                                codeP3 = rec3.nextInt();
                                trouve3=true;
                            } catch(Exception e){
                                System.out.println("Saisir une valeur entiere");
                                trouve3=false;
                                rec3.next();
                            }
                        }while (!trouve3);

                        NoeudPersonne rechercher3= A1.rechercherParCode(codeP3,A1.Arbre);
                        if(rechercher3!=null){
                            try{
                                System.out.println("Le nom de la personne retrouver est : "+rechercher3.getNomPersonne()+",  le prenom : "+rechercher3.getPrenomsPersonne());
                                rechercher3.AfiichageCousin();
                            }catch (Exception e){
                                System.out.println("pas de cousin");
                            }

                           // System.out.println(rechercher3.getNomPersonne()+" "+rechercher3.getPrenomsPersonne()+" n'a pas de cousin ou cousine");
                        }else{
                            System.out.println(" Personne inexistante " );
                        }
                    } catch (Exception e) {
                        System.out.println("Entrez un entier uniquement");
                        System.out.println(e.getMessage());
                    }
                    break;


                case 6:
                    Main.cleanConsole();
                    try {
                        A1 = new AbreGenealogique().deserialiseation();
                        A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom :"+personne.getNomPersonne()+" Prenom : "+personne.getPrenomsPersonne()));
                        Scanner rec5=new Scanner(System.in);
                        int codeP5 = 0;
                        boolean trouve5;
                        System.out.println("Veuillez saisir le code de la personne dont vous chercher ses ascendants");
                        do{
                            try {
                                codeP5 = rec5.nextInt();
                                trouve5=true;
                            } catch(Exception e){
                                System.out.println("saisir une valeur entiere");
                                trouve5=false;
                                rec5.next();
                            }
                        }while (!trouve5);

                        NoeudPersonne rechercher5= A1.rechercherParCode(codeP5,A1.Arbre);
                        if(rechercher5!=null){
                            System.out.println("Les ascendants de la personne dont le code est : "+rechercher5.getIdPersonne()+" de nom et prenoms "+rechercher5.getNomPersonne()+",  prenom : "+rechercher5.getPrenomsPersonne());
                            rechercher5.ascendantPersonne();
                        }else{
                            System.out.println(" La personne que vous chercher son freres ainé n'existe pas " );
                        }

                        //rechercher5.AffichageGraphe();
                    } catch (Exception e) {
                        System.out.println("Entrez un entier uniquement");
                        System.out.println(e.getMessage());
                    }
                    break;


                case 7:
                    Main.cleanConsole();
                try{
                    A1 = new AbreGenealogique().deserialiseation();
                    A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom :"+personne.getNomPersonne()+" Prenom : "+personne.getPrenomsPersonne()));
                    Scanner rec4=new Scanner(System.in);
                    int codeP4 = 0;
                    boolean trouve4;
                    System.out.println("Veuillez saisir le code de la personne dont vous chercher son frere");
                    do{
                        try {
                            codeP4 = rec4.nextInt();
                            trouve4=true;
                        } catch(Exception e){
                            System.out.println("saisir une valeur entiere");
                            trouve4=false;
                            rec4.next();
                        }
                    }while (!trouve4);

                    NoeudPersonne rechercher4= A1.rechercherParCode(codeP4,A1.Arbre);
                    if(rechercher4!=null){
                        System.out.println("La personne dont le code est :"+rechercher4.getIdPersonne()+", de Nom et prenoms: "+rechercher4.getNomPersonne()+"  "+rechercher4.getPrenomsPersonne());
                        rechercher4.frereAine();
                    }else{
                        System.out.println(" la personne dont vous cherchez le frere ainé n'existe pas " );
                    }
                } catch (Exception e) {
                    System.out.println("Entrez un entier uniquement");
                    System.out.println(e.getMessage());
                }
                break;

                case 8:
                    Main.cleanConsole();
                    try{
                        A1 = new AbreGenealogique().deserialiseation();
                        A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom et Prenoms:"+personne.getNomPersonne()+"  "+personne.getPrenomsPersonne()));
                        Scanner rec6=new Scanner(System.in);
                        int codeP6 = 0;
                        boolean trouve6;
                        System.out.println("Veuillez saisir le code de la première personne");
                        do{
                            try {
                                codeP6 = rec6.nextInt();
                                trouve6=true;
                            } catch(Exception e){
                                System.out.println("Saisir une valeur entiere");
                                trouve6=false;
                                rec6.next();
                            }
                        }while (!trouve6);

                        NoeudPersonne rechercher6= A1.rechercherParCode(codeP6,A1.Arbre);
                        if(rechercher6!=null){
                            System.out.println("Les renseignements de la premiere personne, code : "+rechercher6.getIdPersonne()+", Nom et prenoms   "+rechercher6.getNomPersonne()+" "+rechercher6.getPrenomsPersonne());
                        }else{
                            System.out.println(" la premiere personne n'existe pas" );
                        }

                        System.out.println("........................................ Liste des Personnes ................. ............");
                        A1.Arbre.forEach((personne) -> System.out.println("code: "+personne.getIdPersonne()+"   Nom :"+personne.getNomPersonne()+" Prenom : "+personne.getPrenomsPersonne()));
                        Scanner rec7=new Scanner(System.in);
                        int codeP7 = 0;
                        boolean trouve7;
                        System.out.println("Veuillez saisir le code de la deuxième personne");
                        do{
                            try {
                                codeP7 = rec7.nextInt();
                                trouve7=true;
                            } catch(Exception e){
                                System.out.println("Saisir une valeur entiere");
                                trouve7=false;
                                rec6.next();
                            }
                        }while (!trouve7);

                        NoeudPersonne rechercher7= A1.rechercherParCode(codeP7,A1.Arbre);
                        if(rechercher7!=null){
                            System.out.println("Les renseignements de la deuxieme personne : le code : "+rechercher7.getIdPersonne()+"   "+rechercher7.getNomPersonne()+",  prenom : "+rechercher7.getPrenomsPersonne());
                        }else{
                            System.out.println(" La premiere personne n'existe pas" );
                        }
                        if(rechercher7!=null && rechercher6!=null){
                            rechercher6.RechercheLien(rechercher7);
                        }else{
                            System.out.println("Mauvaix identifiant choisi lors de la selection des personnes");
                        }
                    } catch (Exception e) {
                        System.out.println("Entrez un entier uniquement");
                        System.out.println(e.getMessage());
                    }
                    break;
            case 9:
                Main.cleanConsole();
                try {
                    A1 = new AbreGenealogique().deserialiseation();

                    Scanner rec8=new Scanner(System.in);
                    int codeP8 = 0;
                    boolean trouve8;

                    System.out.println("Veuillez saisir le code de la personne dont vous rechercher");
                    do{
                        try {
                            codeP8 = rec8.nextInt();
                            trouve8=true;
                        } catch(Exception e){
                            System.out.println("Saisir une valeur entiere");
                            trouve8=false;
                            rec8.next();
                        }
                    }while (!trouve8);

                    NoeudPersonne rechercher8= A1.rechercherParCode(codeP8,A1.Arbre);
                    if(rechercher8!=null){
                        System.out.println("Le nom de la personne retrouvee est : "+rechercher8.getNomPersonne()+",  le prenom : "+rechercher8.getPrenomsPersonne());

                    }else{
                        System.out.println(" Personne inexistante " );
                    }
                } catch (Exception e) {
                    System.out.println("Entrez un entier uniquement");
                    System.out.println(e.getMessage());
                }
                break;

                case 10:
                    try{
                       //Fonction
                        System.out.println("-----@------Bye-----@------");
                        int i = 0;
                        System.exit(i);
                    } catch (Exception e) {
                        System.out.println("Entrez un entier uniquement");
                        System.out.println(e.getMessage());
                    }
                    break;




                default: System.out.println("Entrez un choix valide s'il vous plait !!! \n");

            }






        }while (yes);

        scanner.close();


    }
    public final static void cleanConsole(){
        try{
            if(System.getProperty("os.name").contains("windows"))
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");

        }catch(Exception ex){}
    }

    private static String Charg() {
        Thread t= new Thread();
int i =0;
        while(i<100){
            i++;
System.out.print('.');
            try{
                t.sleep(60);

            }catch (Exception e){

            };
;
        };
System.out.println(i+"%");

        t.start();
        return " ";
    }


}


