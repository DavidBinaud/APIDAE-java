package tamagoshi.tamagoshis;

import java.util.Random;

public class Tamagoshi {

    private static int lifeTime = 10;

    private int age;

    private int energy;

    private int maxEnergy;

    private int fun;

    private int maxFun;

    private String name;

    private Random random = new Random();

    public Tamagoshi(String name) {
        this.name = name;
        this.age = 0;
        this.maxEnergy = 5 + random.nextInt(5);
        this.energy = 3 + random.nextInt(5);

        this.maxFun = 5 + random.nextInt(5);
        this.fun = 3 + random.nextInt(5);
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
        String str = "";
        if(energy > 4 && fun > 4){
            str = "Tout va bien!";
        } else if(energy <= 4 && fun <= 4) {
            str = "Je suis affamé et je m'ennuie à mourrir !";
        }else if(energy <= 4){
            str = "Je suis affamé";
        } else {
            str = "Je m'ennuie à mourrir !";
        }
        System.out.println(name + " : \"" + str + "\"");
        return energy > 4 && fun > 4;
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

    public boolean joue(){
        if(fun < maxFun){
            fun += 1 + random.nextInt(3);
            System.out.println(name + " : \"On se marre !\"");
            return true;
        }
        System.out.println(name + " : \"laisse-moi tranquille, je bouquine !!\"");
        return false;
    }

    public boolean consommeEnergie(){
        energy--;
        if(energy <= 0){
            System.out.println(name + " : \"Je suis KO\"");
            return false;
        }
        return true;
    }

    public boolean consommeFun(){
        fun--;
        if (fun <= 0){
            System.out.println(name + " :\"snif : je fais une dépression, ciao!\"");
            return false;
        }
        return true;
    }

    public void incrementAge(){
        age++;
    }

    @Override
    public String toString() {
        return "Tamagoshi{" +
                "name='" + name +
                ", age=" + age +
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
