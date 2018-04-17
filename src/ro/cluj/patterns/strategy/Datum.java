package ro.cluj.patterns.strategy;

public class Datum {
    private IDatumsFormat format = null;
    private int tag, monat, jahr = 0;

    public Datum(int tag, int monat, int jahr)
    {
        this.tag = tag;
        this.monat = monat;
        this.jahr = jahr;
    }

    public void setzeFormat (IDatumsFormat format)
    {
        this.format = format;
    }

    public void ausgeben()
    {
        format.datumAusgeben(tag, monat, jahr);
    }
}
