package com.company;

import java.util.Comparator;

public class CritereNom implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return e1.getNom().compareTo(e2.getNom());
    }


}
