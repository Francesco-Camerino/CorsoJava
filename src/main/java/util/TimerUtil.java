package util;

import tombola.ArrayListDaSvuotare;
import tombola.Tombola;

/**
 * La classe TimerUtil è un'utilità per misurare il tempo trascorso tra l'avvio e l'arresto di un'operazione.
 */
public class TimerUtil {
    /** Tempo di inizio dell'operazione */
    private long startTime;
    /** Tempo trascorso tra l'avvio e l'arresto dell'operazione */
    private long elapsedTime;

    /**
     * Avvia il timer impostando il tempo di inizio dell'operazione.
     */
    public void start() {
        startTime = System.currentTimeMillis();
    }

    /**
     * Arresta il timer e calcola il tempo trascorso tra l'avvio e l'arresto dell'operazione.
     */
    public void stop() {
        long endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
    }

    /**
     * Restituisce il tempo trascorso tra l'avvio e l'arresto dell'operazione.
     *
     * @return Il tempo trascorso in millisecondi.
     */
    public long getElapsedTime() {
        return elapsedTime;
    }

    public static void main(String[] args) {

        TimerUtil t1 = new TimerUtil();
        TimerUtil t2 = new TimerUtil();

        t1.start();

        Tombola tom = new Tombola(9000);
        tom.generazioneNumeriUnivoci();

        t1.stop();

        t2.start();

        ArrayListDaSvuotare arr = new ArrayListDaSvuotare(9000);

        arr.svuotaArraylist();
        System.out.println("Numeri dell'array: " + arr.getNumeriDaSvuotare().size());
        t2.stop();

        System.out.println("Tempo di esecuzione t1: " + t1.getElapsedTime() + " millisecondi");
        System.out.println("Tempo di esecuzione t2: " + t2.getElapsedTime() + " millisecondi");
    }


}
