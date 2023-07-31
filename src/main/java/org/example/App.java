package org.example;

import tombola.Tombola;

public class App 
{
    public static void main( String[] args )
    {
       Tombola t = new Tombola();

       final int massimaleNumeri = 20;

       while(t.getNumeriEstratti().size() < massimaleNumeri) {
           int numeroGenerato = Tombola.estrai();
           t.aggiungiNumero(numeroGenerato);
       }

       t.stampaNumeriEstratti();
    }
}
