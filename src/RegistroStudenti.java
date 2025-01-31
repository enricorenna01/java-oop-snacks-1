public class RegistroStudenti {
    
    // Array privato per memorizzare gli oggetti Studente
    private Studente[] studenti;
    private int numStudenti; // Variabile per tenere traccia del numero di studenti nel registro

    // Costruttore senza parametri
    public RegistroStudenti() {
        studenti = new Studente[15]; // Inizializzo l'array con una capacità iniziale di 15
        numStudenti = 0;
    }

    // Metodo per aggiungere uno studente al registro
    public void aggiungiStudente(Studente studente) {
        
        // Verifica se c'è spazio nell'array per aggiungere un altro studente
        if (numStudenti < studenti.length) {
            studenti[numStudenti] = studente;
            numStudenti++;
        } else {
            System.out.println("Registro pieno, impossibile aggiungere altri studenti.");
        }
    }

    // Metodo per stampare la lista degli studenti
    public void stampaStudenti() {
        if (numStudenti == 0) {
            System.out.println("Il registro è vuoto.");
        } else {
            System.out.println("Lista degli studenti:");
            for (int i = 0; i < numStudenti; i++) {
                System.out.println(studenti[i].toString());
            }
        }
    }
}
