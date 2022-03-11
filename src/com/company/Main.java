package com.company;

public class Main {

    public static void main(String[] args) {




            Etudiant e1 = new Etudiant(1, "etud2", "etud2");
            Etudiant e2 = new Etudiant(3, "etud1", "etud1");
            Etudiant e3 = new Etudiant(2, "etud3", "etud3");

            EspritArrayList esprit = new EspritArrayList();
            esprit.ajouterEtudiant(e1);
            esprit.ajouterEtudiant(e2);
            esprit.ajouterEtudiant(e3);

            esprit.trierEtudiantsParId();

            esprit.displayEtudiants();

          /*  EspritVector espVector = new EspritVector();
            Etudiant e5 = new Etudiant(1,"AABDOU","PRENOM");
            Etudiant e2 = new Etudiant(2,"KHALIL","BEN JEMAA");
            Etudiant e3 = new Etudiant(3,"OLFA","BEN AFIA");
            Etudiant e4 = new Etudiant(4,"SHIRAZ","BESROUR");


            espVector.ajouterEtudiant(e1);
            espVector.ajouterEtudiant(e2);
            espVector.ajouterEtudiant(e4);
            espVector.ajouterEtudiant(e3);

            espVector.displayEtudiants();




           */

    }

}

