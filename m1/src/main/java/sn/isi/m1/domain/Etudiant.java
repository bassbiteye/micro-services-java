package sn.isi.m1.domain;


import java.io.Serializable;

public class Etudiant  implements Serializable {
    private int id;
    private String nom,prenom,classe;

    public Etudiant(int id, String nom, String prenom, String classe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.classe = classe;
    }
}
