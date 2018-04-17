package ro.cluj.patterns.strategy;

public class EuropaeischesFormat implements IDatumsFormat {

    @Override
    public void datumAusgeben(int tag, int monat, int jahr) {
        System.out.println("Europaesiches Format : "
        + (tag > 0 ? tag : "0" + tag)
        +" "

        +(monat > 9 ? monat : "0" + monat)
        +"."
        +jahr);
    }
}
