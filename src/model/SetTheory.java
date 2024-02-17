package model;

import java.util.HashSet;
import java.util.Set;

public class SetTheory {
    
    private Set<Integer> setA;
    private Set<Integer> setB;

    public void setSetA(Set<Integer> setA) {
        this.setA = setA;
    }
    public void setSetB(Set<Integer> setB) {
        this.setB = setB;
    }

    public Set<Integer> getSetA() {
        return this.setA;
    }
    public Set<Integer> getSetB() {
        return this.setB;
    }

    public Set<Integer> union() {
        Set<Integer> unionSet = new HashSet<Integer>(setA);
        unionSet.addAll(setB);
        return unionSet;
    }

    public Set<Integer> difference() {
        Set<Integer> difSet = new HashSet<Integer>(setA);
        difSet.removeAll(setB);
        return difSet;
    }

    public Set<Integer> intersection() {
        Set<Integer> intersectionSet = new HashSet<Integer>(setA);
        intersectionSet.retainAll(setB);
        return intersectionSet;
    }
}
