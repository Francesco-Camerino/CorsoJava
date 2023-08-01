package util;

import java.util.HashMap;
import java.util.Map;

/**
 * La classe Fibonacci calcola il valore dell'n-esimo numero della sequenza di Fibonacci utilizzando un approccio ricorsivo.
 */
public class Fibonacci {

    // Mappa per memorizzare i risultati intermedi dei calcoli
    private final Map<Long, Long> memo = new HashMap<>();

    /**
     * Calcola il valore dell'n-esimo numero della sequenza di Fibonacci utilizzando
     * un approccio ricorsivo ottimizzato con la tecnica di memorizzazione.
     *
     * @param n L'indice dell'n-esimo numero della sequenza di Fibonacci da calcolare.
     * @return Il valore dell'n-esimo numero della sequenza di Fibonacci.
     */
    public Long getRicorsivaOttimizzata(Long n) {
        if (n == 0 || n == 1) {
            return 1L;
        }

        // Controlla se il risultato è già stato calcolato e memorizzato
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        // Se il risultato non è stato memorizzato, calcolalo e memorizzalo
        long fibonacci = getRicorsivaOttimizzata(n - 1) + getRicorsivaOttimizzata(n - 2);
        memo.put(n, fibonacci);

        return fibonacci;
    }
    /**
     * Calcola il valore dell'n-esimo numero della sequenza di Fibonacci utilizzando un approccio ricorsivo.
     *
     * @param n L'indice dell'n-esimo numero della sequenza di Fibonacci da calcolare.
     * @return Il valore dell'n-esimo numero della sequenza di Fibonacci.
     */
    public Long getRicorsiva(Long n) {
        if (n == 0) {
            return 1L;
        }
        if (n.equals(1L)) {
            return 1L;
        }
        return getRicorsiva(n - 1) + getRicorsiva(n - 2);
    }

    /**
     * Calcola il valore dell'n-esimo numero della sequenza di Fibonacci utilizzando
     * un approccio iterativo.
     *
     * @param n L'indice dell'n-esimo numero della sequenza di Fibonacci da calcolare.
     * @return Il valore dell'n-esimo numero della sequenza di Fibonacci.
     */
    public Long getIterativa(Long n) {
        if (n == 0 || n == 1) {
            return 1L;
        }

        long prev1 = 1L; // Valore di Fibonacci(n - 1)
        long prev2 = 1L; // Valore di Fibonacci(n - 2)
        long fibonacci = 0L; // Valore di Fibonacci(n)

        for (long i = 2; i <= n; i++) {
            fibonacci = prev1 + prev2;
            prev2 = prev1;
            prev1 = fibonacci;
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        final long LIMIT = 12L;
        TimerUtil tRicorsiva = new TimerUtil();
        TimerUtil tIterativa = new TimerUtil();
        TimerUtil tRicorsivaOttimizzata = new TimerUtil();

        // CALCOLO RICORSIVO PURO
        tRicorsiva.start();
        for (long i = 0L; i < LIMIT; i++) {
            Long fibonacci = f.getRicorsiva(i);
            System.out.println("Fibonacci ricorsiva" + i + "->" + fibonacci);
        }
        tRicorsiva.stop();

        //CALCOLO ITERATIVO
        tIterativa.start();

        for (long i = 0L; i < LIMIT; i++) {
            Long fibonacci = f.getIterativa(i);
            System.out.println("Fibonacci iterativa" + i + "->" + fibonacci);
        }

        tIterativa.stop();

        //CALCOLO RICORSIVO OTTIMIZZATO
        tRicorsivaOttimizzata.start();

        for (long i = 0L; i < LIMIT; i++) {
            Long fibonacci = f.getRicorsivaOttimizzata(i);
            System.out.println("Fibonacci ricorsiva ottimizzata" + i + "->" + fibonacci);
        }

        tRicorsivaOttimizzata.stop();

        //RISULTATI
        System.out.println("tr: " + tRicorsiva.getElapsedTime() + " ms");
        System.out.println("ti: " + tIterativa.getElapsedTime() + " ms");
        System.out.println("tro: " + tRicorsivaOttimizzata.getElapsedTime() + " ms");
    }
}
