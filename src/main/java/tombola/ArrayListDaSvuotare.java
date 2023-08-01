package tombola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * La classe ArrayListDaSvuotare rappresenta un ArrayList di interi con la capacità specificata e fornisce
 * metodi per stampare e svuotare l'ArrayList.
 */
public class ArrayListDaSvuotare {
    /** ArrayList di interi da svuotare */
    private final ArrayList<Integer> numeriDaSvuotare;

    /**
     * Crea una nuova istanza della classe ArrayListDaSvuotare con la capacità specificata.
     *
     * @param capacita La capacità dell'ArrayList.
     */
    public ArrayListDaSvuotare(Integer capacita) {
        this.numeriDaSvuotare = new ArrayList<>(capacita);
        for (int i = 0; i < capacita; i++) {
            numeriDaSvuotare.add(i + 1);
        }
    }

    /**
     * Ottieni l'ArrayList di numeri da svuotare.
     *
     * @return L'ArrayList di numeri da svuotare.
     */
    public ArrayList<Integer> getNumeriDaSvuotare() {
        return numeriDaSvuotare;
    }

    /**
     * Stampa tutti gli elementi presenti nell'ArrayList numeriDaSvuotare.
     */
    public void stampaArrayList() {
        System.out.println("-----------------------------");
        System.out.println("Elementi dell'ArrayList:");
        Iterator<Integer> iterator = numeriDaSvuotare.iterator();
        int index = 1;
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Elemento numero " + (index) + " con valore " + element);
            index++;
        }
    }

    /**
     * Svuota l'ArrayList numeriDaSvuotare e stampa gli elementi rimossi.
     */
    public void svuotaArraylist() {
        stampaArrayList();
        while (!numeriDaSvuotare.isEmpty()) {
            Random random = new Random();
            int indice = random.nextInt(this.numeriDaSvuotare.size());
            int numeroRimosso = numeriDaSvuotare.remove(indice);
            System.out.println("Numero rimosso: " + numeroRimosso);
        }
        System.out.println("\n");
        stampaArrayList();
    }

    public static void main(String[] args) {
        ArrayListDaSvuotare arr = new ArrayListDaSvuotare(90);
        arr.svuotaArraylist();
    }

}
