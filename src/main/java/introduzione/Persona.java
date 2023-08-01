package introduzione;

public class Persona {
    private String nome;
    private String cognome;
    private int eta;

    public Persona(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = Math.max(eta, 0);
        /*equivalente a
        if(eta < 0) {
        this.eta = 0
        } else {
        this.eta = eta
        }
        * */
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void presentazione() {
        System.out.println("Io sono " + this.nome + " " + this.cognome + " e ho " + this.eta + " anni");
    }

    public static void main(String[] args) {
        Persona p1 = new Persona("Francesco","Camerino",21);
        Persona p2 = new Persona("Diego","Renna",2);
        p2.setEta(-2);
       p1.presentazione();
       p2.presentazione();
    }
}
