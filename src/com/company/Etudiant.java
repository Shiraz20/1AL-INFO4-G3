package com.company;

public class Etudiant implements Comparable<Etudiant> {
    private int id;
    private String nom;
    private String prenom;

    public Etudiant() {
    }

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Etudiant other = (Etudiant) obj;

        return this.id == other.id;

    }

    @Override
    public int compareTo(Etudiant e) {
        return this.id-e.id;
    }

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant(1, "Besrour", "Shiraz");
        Etudiant e2 = new Etudiant(2, "Ben Jammaa", "Khalil");
        Etudiant e3 = new Etudiant(3, "Ben Afia", "Olfa");
        Etudiant e4 = new Etudiant(4, "Souid", "Abdou");

        e1.toString();
        e2.toString();
    }





}

