package ro.cluj.patterns.strategy;

public class TestStrategie {
    public static void main(String[] args) {
        Datum datum = new Datum(21,9,1985);

        datum.setzeFormat(new EuropaeischesFormat());
        datum.ausgeben();

        datum.setzeFormat(new AmerikanischesFormat());
        datum.ausgeben();
    }
}
