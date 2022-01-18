package question2;

import question1.PilePleineException;
import question1.PileVideException;

import java.util.Vector;

/**
 * Décrivez votre classe PileVector ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Pile3 implements PileI {

    private Vector<Object> v;
    private int ptr;
    private int capacite;

    public Pile3() {
        this(CAPACITE_PAR_DEFAUT);
    }

    public Pile3(int taille) {
        if (taille < 0)
            taille = CAPACITE_PAR_DEFAUT;
        this.v = new Vector<Object>(taille);
        this.capacite=taille;
        this.ptr = 0;
    }

    public void empiler(Object o) throws PilePleineException {
        // à compléter
        if (estPleine())
            throw new PilePleineException();
        v.add(o);
        this.ptr++;
    }

    public Object depiler() throws PileVideException {
        if (estVide())
            throw new PileVideException();
        this.ptr--;
        return v.remove(ptr);
    }

    public Object sommet() throws PileVideException {
        // à compléter
        if (estVide())
            throw new PileVideException();
        return v.get(ptr-1);
    }

    public int taille() {
        // à compléter
        return v.size();
    }

    public int capacite() {
        // à compléter
        return v.capacity();
    }

    public boolean estVide() {
        // à compléter
        return v.isEmpty();
    }

    public boolean estPleine() {
        // à compléter
        return ptr == this.capacite;
    }

    public String toString() {
        // à compléter
        String s = "[";
        for (int i = ptr - 1; i >= 0; i--) {
            s += v.get(i);
            if (i > 0)
                s += ", ";
        }
        return s + "]";
    }

    public boolean equals(Vector<Object> o) {
        // à compléter
        return v.equals(o);
    }

    // fonction fournie
    public int hashCode() {
        return toString().hashCode();
    }

}
