package tombola;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class Tombola {
    // lista dei numeri da popolare
    private final Set<Integer> numeriEstratti;
    //massimo numero di valori che si possono avere nel set
    private final int massimaleNumeri;

    public Tombola(int massimaleNumeri) {
        this.massimaleNumeri = massimaleNumeri;
        this.numeriEstratti = new HashSet<>(massimaleNumeri);
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

    // estrazione di numeri da 0 ad un range specifico
    public static int estrai(int range) {
        Random random = new Random();
        return random.nextInt(range) + 1;
    }

    // popolamento di un set fino al massimale
    public void generazioneNumeriUnivoci() {
        while(numeriEstratti.size() < massimaleNumeri) {
            int numeroGenerato = Tombola.estrai(90);
            numeriEstratti.add(numeroGenerato);
        }
        stampaNumeriEstratti();
    }

    public static void main(String[] args) {
        Tombola t = new Tombola(20);
        t.generazioneNumeriUnivoci();
    }
}
