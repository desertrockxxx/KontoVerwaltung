public class Main {
    public static void main(String[] args) {
        Kunde sinan = new Kunde("Sinan",222);
        GiroKonto sinanGiro = new GiroKonto(1, sinan, 100);

        sinanGiro.einzahlen(200);
        System.out.println(sinanGiro.getSaldo());
        sinanGiro.auszahlen(1301);
        System.out.println(sinanGiro.getSaldo());


    }
}
