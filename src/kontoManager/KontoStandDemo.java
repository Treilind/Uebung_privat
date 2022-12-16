package kontoManager;

public class KontoStandDemo {

    public static void main(String[] args) {
        JugendGiroKonto jugiko = new JugendGiroKonto("Thorsten Reisinger", -800, 1000);

        jugiko.einzahlen(3000);
        System.out.println(jugiko.getKontostand());
        jugiko.auszahlen(700);
        System.out.println(jugiko.getKontostand());
        jugiko.auszahlen(1100);
        System.out.println(jugiko.getKontostand());

        Girokonto giko = jugiko;

        System.out.println();
        System.out.println(giko.getKontostand());
        giko.einzahlen(3000);
        System.out.println(jugiko.getKontostand());
        giko.auszahlen(700);
        System.out.println(jugiko.getKontostand());


    }
}
