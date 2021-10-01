package testPackage;

import java.util.Objects;

public class Bidule implements Cloneable {

    private int valeur;
    private Personne personne;
    private int compteur;

    public Bidule(int valeur) {
  this.valeur = valeur;
  personne = new Personne("toto " + valeur);
  compteur = 0;
    }

    @Override
    public String toString() {
  return super.toString() + " contient -> value = " + valeur + " ; pers = " + personne;
    }

    public void incrementCompteur() {
  compteur++;
    }

    /**
     * @param value
     *            the value to set
     */
    public void setValeur(int value) {
  this.valeur = value;
    }

    /**
     * @return the pers
     */
    public Personne getPersonne() {
  return personne;
    }

  @Override
  protected Object clone() throws CloneNotSupportedException {
      Bidule clone = new Bidule(this.valeur);
      clone.compteur = this.compteur;
    return clone;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bidule bidule = (Bidule) o;
    return valeur == bidule.valeur && compteur == bidule.compteur && personne.equals(bidule.personne);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valeur, personne, compteur);
  }

  public static void main(String[] args) {
  Bidule bidule1 = new Bidule(2);
  System.out.println("bidule1 = " + bidule1);
  System.out.println();
  bidule1.incrementCompteur();

  Bidule bidule2 = new Bidule(4);

  System.out.println("bidule2 = " + bidule2);

  System.out.println("\n----------clonage de bidule1 dans bidule2------------\nRésultat :\n");

  try {
      bidule2 = (Bidule) bidule1.clone();
  }
  catch(CloneNotSupportedException e) {
      e.printStackTrace();
  }

  System.out.println("bidule1 = " + bidule1);

  System.out.println("\nbidule2 = " + bidule2);
  System.out.println("\nbidule1.equals(bidule2) apres clonage (doit retourne vrai) -> " + bidule1.equals(bidule2) + "\n");

  System.out.println("----------manipulation du clone bidule2 sur value :  --- bidule2.setValeur(9); ---\nRésultat :\n");

  bidule2.setValeur(9);

  System.out.println("bidule1 = " + bidule1);
  System.out.println("\nbidule2 = " + bidule2);

  System.out.println("\nbidule1.equals(bidule2) apres manipulation (doit retourne faux) -> " + bidule1.equals(bidule2) + "\n");

  System.out.println("\n\n-----manipulation du clone bidule2 sur personne : --- bidule2.getPersonne().setName(\"bidule\"); ---\nRésultat :\n");

  bidule2.getPersonne().setName("bidule");

  System.out.println("bidule1 = " + bidule1);
  System.out.println("\nbidule2 = " + bidule2);

    }

}