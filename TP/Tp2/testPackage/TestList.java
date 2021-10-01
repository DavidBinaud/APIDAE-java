package testPackage;
import mesObjets.Salarie;
import mesObjets.SalarieComparatorByName;
import mesObjets.SalarieComparatorBySalaryName;

import java.util.ArrayList;
import java.util.Collections;
public class TestList {
    public static void main(String[] args) {
        ArrayList<Salarie> liste = new ArrayList<>();
        liste.add(new Salarie("Pierre","Gold n Gold",60000));
        liste.add(new Salarie("Jacques", "Clean n Dry",1000));
        liste.add(new Salarie("Jules", "Clean n Dry",1000));
        liste.add(new Salarie("Albert", "No where", 2000));
        liste.add(new Salarie("Zizou", "RMCF", 60000));
        liste.add(new Salarie("Charles","Dad n Son", 5000));

        System.out.println("Liste non triée: " + liste);

        Collections.sort(liste);
        System.out.println("Liste triée par salaire décroissant: " +liste);

        Collections.sort(liste, new SalarieComparatorByName());
        System.out.println("Liste triée par ordre alphabétique: " +liste);

        Collections.sort(liste, new SalarieComparatorBySalaryName());
        System.out.println("Liste triée par Salaire et ordre alphabétique: " +liste);
    }
}
