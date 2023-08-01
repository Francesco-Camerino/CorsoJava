package tombola;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Classe Tombola utilizzata per generare un set di numeri univoci e stamparli.
 */
public class Tombola {
    /** lista dei numeri da popolare */
    private final Set<Integer> numeriEstratti;
    /** massimo numero di valori che si possono avere nel set */
    private final int massimaleNumeri;

    /**
     * Costruttore per la classe Tombola.
     *
     * @param massimaleNumeri Il massimo numero di valori che il set può contenere.
     */
    public Tombola(int massimaleNumeri) {
        this.massimaleNumeri = massimaleNumeri;
        this.numeriEstratti = new HashSet<>(massimaleNumeri);
    }

    /**
     * Stampa tutti gli elementi presenti nel set numeriEstratti.
     */
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

    /**
     * Estrae un numero casuale tra 1 e il valore specificato come range.
     *
     * @param range Il range massimo per l'estrazione del numero.
     * @return Un numero casuale estratto tra 1 e il range specificato.
     */
    public static int estrai(int range) {
        Random random = new Random();
        return random.nextInt(range) + 1;
    }

    /**
     * Genera numeri univoci fino al massimale specificato nel costruttore.
     * Stampa poi tutti i numeri estratti.
     */
    public void generazioneNumeriUnivoci() {
        while (numeriEstratti.size() < massimaleNumeri) {
            int numeroGenerato = Tombola.estrai(massimaleNumeri);
            numeriEstratti.add(numeroGenerato);
        }
        stampaNumeriEstratti();
    }

    public static void main(String[] args) {
        Tombola t = new Tombola(20);
        t.generazioneNumeriUnivoci();
    }
}
