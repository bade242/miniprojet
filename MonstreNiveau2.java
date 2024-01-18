package tp.estiam.moduls;

import java.util.Random;

public class MonstreNiveau2 extends MonstreNiveau1 {


    public MonstreNiveau2() {

    }


    public MonstreNiveau2(int degat, boolean vivant) {
        super(degat, vivant);
    }

    @Override
    public int attaquer(Joueur player){

        super.attaquer(player);

        int monstrede = jeterDe();
        if(monstrede != 6){
            player.recoitDegat(monstrede * 5);

            System.out.println("Le monstre vient de lancer son attaque");

        }
        return monstrede;
    }


}





