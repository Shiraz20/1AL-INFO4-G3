

package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EspritArrayList implements University {

    private ArrayList<Etudiant> list;

    public EspritArrayList() {
        list = new ArrayList<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        list.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return list.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {

        for (Etudiant e : list) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        list.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : list) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(list);
    }


    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(list, new CritereNom());
    }

    public void trierEtudiantsParPrenom() {
        Collections.sort(list, new Comparator<Etudiant>() {
            @Override
            public int compare(Etudiant e1, Etudiant e2) {
                return e1.getPrenom().compareTo(e2.getPrenom());
            }
        });
    }

    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(5 ,"Ben Jammaa","Khalil");
        Etudiant e2 = new Etudiant(4,"Souid","Abdo");
        Etudiant e3 = new Etudiant(1,"Ben Ahmed","Hsan");
        Etudiant e4 = new Etudiant(6,"Dkhil","Karam");

        EspritArrayList list = new EspritArrayList();

        list.ajouterEtudiant(e1);
        list.ajouterEtudiant(e2);
        list.ajouterEtudiant(e3);
        list.ajouterEtudiant(e4);


//        list.displayEtudiants();
//         System.out.println(list.rechercherEtudiant(e3));
        list.supprimerEtudiant(e3);
       //  list.trierEtudiantsParId();
       // list.trierEtudiantsParPrenom();
        list.trierEtudiantsParNom();
        list.displayEtudiants();



    }

}
