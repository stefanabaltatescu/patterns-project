package ro.cluj.patterns.template;

public class Test {
	public static void main(String[] args) {
		System.out.println("Karte an die Freunde");
		UrlaubskarteAnFreunde karteFreunde = new UrlaubskarteAnFreunde();
		karteFreunde.karteSchreiben();
		
		System.out.println();
		System.out.println("Karte an die Firma");
		
		UrlaubskarteAnFirma karteFirma = new UrlaubskarteAnFirma();
		karteFirma.karteSchreiben();
	}

}
