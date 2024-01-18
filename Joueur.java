package tp.estiam.moduls;

import java.util.Random;

public class Joueur {

    protected String nom;
    protected String prenom;
    protected String pseudo;
    protected int pv = 100;

    protected De de = new De();


    public Joueur() {

    }

    public Joueur(String nom, String prenom, String pseudo) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
    }

    public boolean estVivant() {
        if (pv > 0) {
            System.out.println("Joueur est vivant");
            return true;
        } else {
            System.out.println("Game over");
            return false;
        }

    }

    public int jeterDe() {
        return de.jeterDe();
    }

    public void attaquer(MonstreNiveau1 monstre) {

        int joueurde = jeterDe();
        int demon = monstre.jeterDe();

        if (joueurde >= demon) {
            monstre.recoitDegat();
        }

    }

    public void recoitDegat(int degats) {

        pv = pv - degats;
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

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

}
