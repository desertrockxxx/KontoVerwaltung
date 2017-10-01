public abstract class Konto {
    private int kontonummer;
    private Kunde kontoinhaber;
    protected double saldo = 100;

    public Konto(int kontonummer, Kunde kontoinhaber, double saldo) {
        this.kontonummer = kontonummer;
        this.kontoinhaber = kontoinhaber;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public abstract void einzahlen(double einzahlung);

    public abstract void auszahlen(double auszahlung);

    @Override
    public String toString() {
        return "Konto{" +
                "kontonummer=" + kontonummer +
                ", kontoinhaber=" + kontoinhaber +
                ", saldo=" + saldo +
                '}';
    }
}
