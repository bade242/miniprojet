package tp.estiam.moduls;

import java.util.Random;

public class MonstreNiveau1 {

    protected int degat;

    protected boolean vivant = true;

    protected De de = new De();

    public MonstreNiveau1() {

    }

    public MonstreNiveau1(int degat, boolean vivant) {
        this.degat = degat;
        this.vivant = vivant;
    }

    public  int jeterDe(){

        return de.jeterDe();
    }

    public int attaquer(Joueur player){

        int monstrede = jeterDe();
        int playerde = player.jeterDe();
        if(monstrede > playerde){
            player.recoitDegat(monstrede);

            System.out.println("Le monstre vient de lancer son attaque");

        }
        return monstrede;

    }

    public void recoitDegat(){
        vivant = false;

    }

}








