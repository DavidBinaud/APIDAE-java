package tamagoshi.tamagoshis;

import java.util.Random;

public class Tamagoshi {

    private static int lifeTime = 10;

    private int age;

    private int energy;

    private int maxEnergy;

    private String name;

    private Random random = new Random();

    public Tamagoshi(String name) {
        this.name = name;
        this.age = 0;
        this.maxEnergy = 5 + random.nextInt(5);
        this.energy = 3 + random.nextInt(5);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getLifeTime() {
        return lifeTime;
    }

    public boolean parle(){
        System.out.println(name + " : \"" + (energy > 4 ? "Tout va bien!" : "Je suis affamé") + "\"");
        return energy > 4;
    }

    public boolean mange(){
        if(energy < maxEnergy){
            energy += 1 + random.nextInt(3);
            System.out.println(name + " : \"Miam c'est bon ! *-*\"");
            return true;
        }
        System.out.println(name + " : \"Pas faim!\"");
        return false;
    }

    public boolean consommeEnergie(){
        energy--;
        age++;
        if(energy <= 0){
            System.out.println(name + " : \"Je suis KO\"");
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tamagoshi{" +
                "name='" + name +
                ", energy=" + energy +
                ", maxEnergy=" + maxEnergy + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Tamagoshi tamagoshi1 = new Tamagoshi("Arnaud");
        Tamagoshi tamagoshi2 = new Tamagoshi("Nath");

        System.out.println(tamagoshi1 + " " + tamagoshi2);
        tamagoshi1.parle();
        tamagoshi2.parle();

        tamagoshi1.mange();
        tamagoshi2.mange();

        tamagoshi1.consommeEnergie();
        tamagoshi2.consommeEnergie();
        System.out.println(tamagoshi1 + " " + tamagoshi2);

    }
}
