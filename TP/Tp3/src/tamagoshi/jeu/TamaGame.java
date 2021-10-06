package tamagoshi.jeu;

import tamagoshi.tamagoshis.Tamagoshi;
import tamagoshi.util.Utilisateur;

import java.util.ArrayList;
import java.util.StringJoiner;

import static java.lang.Integer.parseInt;

public class TamaGame {
    ArrayList<Tamagoshi> tamagoshis;
    ArrayList<Tamagoshi> tamagoshisPlaying;

    public TamaGame(){
        tamagoshis = new ArrayList<>();
        tamagoshisPlaying = new ArrayList<>();
        initialisation();
    }

    private void initialisation(){
        System.out.println("Entrez le nombre de tamagoshis désiré:");
        int nbOfTamagoshis = Integer.parseInt(Utilisateur.saisieClavier());
        for (int i = 0; i < nbOfTamagoshis; i++) {
            System.out.println("Entrez le nom du tamagoshi numéro " + i + " :");
            Tamagoshi newTamagoshi = new Tamagoshi(Utilisateur.saisieClavier());
            tamagoshis.add(newTamagoshi);
            tamagoshisPlaying.add(newTamagoshi);
        }
    }

    public void play(){
        int maxRound = Tamagoshi.getLifeTime();
        for(int i = 0; i < maxRound; i++){
            if(tamagoshisPlaying.isEmpty()) {
                break;
            } else {
                System.out.println("\n------ Cycle " + (i+1) + " ------");

                //Parler
                StringJoiner sj = new StringJoiner(" ");
                for (Tamagoshi t : tamagoshisPlaying) {
                    t.parle();
                    sj.add("(" + tamagoshisPlaying.indexOf(t) + ") " + t.getName());
                }

                //Manger
                System.out.println("Nourrir quel tamagoshi ?");
                System.out.println(sj);
                System.out.println("Entrez un choix :");

                try{
                    int tamagoshiEating = parseInt(Utilisateur.saisieClavier());
                    tamagoshisPlaying.get(tamagoshiEating).mange();
                } catch(Exception e) {
                    System.out.println(tamagoshisPlaying.get(0).getName() + " a été nourri par défaut");
                    tamagoshisPlaying.get(0).mange();
                }


                ArrayList<Tamagoshi> tamagoshisToRemove = new ArrayList<>();
                for (Tamagoshi t : tamagoshisPlaying) {
                    if (!t.consommeEnergie()) {
                        tamagoshisToRemove.add(t);
                    }
                }

                for (Tamagoshi t: tamagoshisToRemove) {
                    tamagoshisPlaying.remove(t);
                }
            }
        }
        resultat();
    }

    public int score(){
        int sumAge = 0;
        for (Tamagoshi t: tamagoshis) {
            sumAge += t.getAge();
        }
        return (100 * sumAge / (Tamagoshi.getLifeTime() * tamagoshis.size()));
    }

    public void resultat(){
        System.out.println("\n------ bilan ------");
        for (Tamagoshi t: tamagoshis) {
            if(tamagoshisPlaying.contains(t)){
                System.out.println(t.getName() + " a survécu et vous remercie :)");
            } else {
                System.out.println(t.getName() + " n'est pas arrivé au bout et ne vous félicite pas :(");
            }
        }
        System.out.println("score obtenu :" + score() + "%");
    }

    @Override
    public String toString() {
        return "TamaGame{" +
                "tamagoshis=" + tamagoshis +
                ", tamagoshisPlaying=" + tamagoshisPlaying +
                '}';
    }

    public static void main(String[] args) {
        TamaGame jeu = new TamaGame();
        jeu.play();
    }

}
