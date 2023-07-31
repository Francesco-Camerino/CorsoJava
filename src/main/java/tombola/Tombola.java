package tombola;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Tombola {
    private final Set<Integer> numeriEstratti;

    public Tombola() {
        this.numeriEstratti = new HashSet<>(20);
    }

    public Set<Integer> getNumeriEstratti() {
        return numeriEstratti;
    }
    public void stampaNumeriEstratti() {
        System.out.println("Elementi del Set:");
        Iterator<Integer> iterator = numeriEstratti.iterator();
        int index = 1;
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Elemento numero " + (index) + " con valore " + element);
            index++;
        }
    }

    public void aggiungiNumero(int numero) {
        numeriEstratti.add(numero);
    }

    public static int estrai() {
        Random random = new Random();
        return random.nextInt(90) + 1;
    }
}
