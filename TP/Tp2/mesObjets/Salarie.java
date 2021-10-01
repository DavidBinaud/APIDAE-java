package mesObjets;
import java.lang.NullPointerException;
public class Salarie implements Comparable{

    private String nom;
    private String prenom;
    private float salaire;

    public Salarie(String nom, String prenom, float salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public float getSalaire() {
        return salaire;
    }

    @Override
    public String toString() {
        return "{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    @Override
    public int compareTo(Object o) throws NullPointerException{
        if (this == o) return 0;
        if (o == null || getClass() != o.getClass()) throw new NullPointerException();
        Salarie s = (Salarie) o;
        if(this.salaire < s.salaire)return 1;
        else if(this.salaire == s.salaire) return 0;
        return -1;
    }
}
