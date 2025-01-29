public class Studente {
  
    //Attributi
    String nome;
    String cognome;
    int età;

    //Costruttore
    public Studente(String nome, String cognome, int età){
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
    }

    //Metodo
    public String infoStudente(){
        return this.nome + " " + this.cognome + ", " + this.età + " anni";
    }

    //Main
    public static void main(String[] args) {
        Studente studente1 = new Studente("Enrico", "Renna", 23);

        System.out.println(studente1.infoStudente());
    }

    
}
