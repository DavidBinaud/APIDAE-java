package testPackage;

import java.util.Objects;

public class Personne{

  private String name;
 
  public Personne(String nom) {
    name = nom;
  }
 
  @Override
  public String toString() {
    return super.toString()+"  -> name = \""+name+"\"";
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Personne personne = (Personne) o;
    return name.equals(personne.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}