package tombola;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class ArrayListDaSvuotare {
    //Arraylist dei numeri della tombola (da 1 a 90) da svuotare
    private final ArrayList<Integer> numeriDaSvuotare;

    public ArrayListDaSvuotare(Integer capacita) {
        this.numeriDaSvuotare = new ArrayList<>(capacita);
        for (int i = 0; i < capacita; i++) {
            numeriDaSvuotare.add(i +1);
        }
    }

    public void stampaArrayList() {
        System.out.println("-----------------------------");
        System.out.println("Elementi dell' Arraylist:");
        Iterator<Integer> iterator = numeriDaSvuotare.iterator();
        int index = 1;
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Elemento numero " + (index) + " con valore " + element);
            index++;
        }
    }

    //svuotare arraylist (la tombola) tramite indice casuale eg classica estrazione di una tombola
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
