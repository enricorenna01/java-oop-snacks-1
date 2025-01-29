public class ContoBancario {
    
    //Attributi
    String numeroConto ;
    double saldo;

    //Costruttore
    public ContoBancario(String numeroConto){
        this.numeroConto = numeroConto;
        this.saldo = 0.0;
    }

    //Metodo per depositare denaro
    public void deposita(double importo){
        if (importo > 0) {
            saldo += importo;
            System.out.println("Hai depositato un importo di " + importo + " euro");
        } else {
            System.out.println("L'importo da depositare deve essere positivo");
        }
    }

    //Metodo per prelevare denaro
    public void preleva(double importo){
        if (importo > 0 && saldo >= importo) {
            saldo -= importo;
            System.out.println("Hai prelevato un importo di " + importo + " euro");
        } else if (importo > saldo) {
            System.out.println("Il tuo saldo è insufficiente per il prelevio");
        } else {
            System.out.println("L'importo del prelevio deve essere positivo");
        }
    }

    //Metodo per ottenere il saldo corrente
    public double getSaldo(){
        return saldo;
    }

    //Main
    public static void main(String[] args) {
        ContoBancario conto = new ContoBancario("12345");

        //Esempi
        conto.deposita(450.0);
        System.out.println(conto.getSaldo());

        conto.preleva(250.0);
        System.out.println(conto.getSaldo());

        conto.preleva(500.0);
        System.out.println(conto.getSaldo());
    }
}
