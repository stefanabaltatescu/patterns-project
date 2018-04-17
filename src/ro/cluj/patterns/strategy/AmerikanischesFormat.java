package ro.cluj.patterns.strategy;

public class AmerikanischesFormat implements IDatumsFormat {
    @Override
    public void datumAusgeben(int tag, int monat, int jahr) {
        System.out.println("Amerikanisches Format: "
        + (monat > 9 ? monat : "0" + monat)
        +"/"
        +(tag > 9 ? tag : "0" + tag)
        +"/"
        +jahr);
    }
}
