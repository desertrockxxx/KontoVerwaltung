public class GiroKonto extends Konto {
    private double kreditrahmen = 1000.0;

    public GiroKonto(int kontonummer, Kunde kontoinhaber, double saldo) {
        super(kontonummer, kontoinhaber, saldo);
    }

    public void setKreditrahmen(double kreditrahmen) {
        if (kreditrahmen > 100){
            System.out.println(kreditrahmen + " geht net! Wird auf 100 gesetzt jetzt. Basta.");
            kreditrahmen = 100;
        }
        this.kreditrahmen = kreditrahmen;
    }

    public double getKreditrahmen() {
        return kreditrahmen;
    }

    @Override
    public void einzahlen(double einzahlung) {
        saldo += einzahlung;
        System.out.println("du hast " + einzahlung + " eingezahlt");
    }

    @Override
    public void auszahlen(double auszahlung) {
        double tmp = auszahlung - saldo;
        if(tmp > kreditrahmen) {
            System.out.println("nicht möglich");
        }
        else {
            saldo -= auszahlung;
            System.out.println("du hast " + auszahlung + " ausgezahlt bekommen");
        }
    }
}
