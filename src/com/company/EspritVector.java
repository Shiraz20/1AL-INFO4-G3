package com.company;

import java.util.Collections;
import java.util.Vector;

public class EspritVector implements University{
    private Vector<Etudiant> list;

    public EspritVector() {
        list=new Vector<>();
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
        //maniere 1
//        for(int i=0;i<list.size();i++)
//            if(list.get(i).getNom().equals(nom))
//                return true;
//        return false;

//maniere 2
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
    public void trierEtudiantsParNom() {
        Collections.sort(list, new CritereNom());

        // list.sort(c);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        EspritVector espVector = new EspritVector();
        Etudiant e1 = new Etudiant(1,"AABDOU","PRENOM");
        Etudiant e2 = new Etudiant(2,"KHALIL","BEN JEMAA");
        Etudiant e3 = new Etudiant(3,"OLFA","BEN AFIA");
        Etudiant e4 = new Etudiant(4,"SHIRAZ","BESROUR");


        espVector.ajouterEtudiant(e1);
        espVector.ajouterEtudiant(e2);
        espVector.ajouterEtudiant(e4);
        espVector.ajouterEtudiant(e3);

        espVector.displayEtudiants();

    }

}
