package mesObjets;

import java.util.Comparator;

public class SalarieComparatorBySalaryName implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        if (o1 == o2) return 0;
        if (o1 == null || o2 == null) throw new NullPointerException();
        if(o1.getClass() != o2.getClass()) throw new ClassCastException();
        Salarie s1 = (Salarie) o1;
        Salarie s2 = (Salarie) o2;
        if(s1.getSalaire() < s2.getSalaire())return 1;
        else if(s1.getSalaire() == s2.getSalaire()) return s1.getNom().compareTo(s2.getNom());
        return -1;
    }

}
