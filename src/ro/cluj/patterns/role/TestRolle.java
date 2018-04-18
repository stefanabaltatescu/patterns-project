package ro.cluj.patterns.role;

public class TestRolle {
	public static void main (String[] args)
	{
	//Kernobjekte werden erzeugt
	Mitarbeiter maier = new Mitarbeiter("Maier");
	Mitarbeiter schulze = new Mitarbeiter("Schulze");
	
	//Rollenobjekte der Abteilung Entwicklung
	Entwicklung entwicklung1 = new Entwicklung ("Produkt 2.0");
	Entwicklung entwicklung2 = new Entwicklung ("Produkt  Addon 1.0");
	
	//Zuordnung der Rolle zu den Kernobjekten
	entwicklung1.setMitarbeiter (schulze);
	entwicklung2.setMitarbeiter (maier);
	
	//Ausgabe der Projekte
	System.out.println("\nAktuelle Projekte der Mitarebeiter: ");
	entwicklung1.printProjekt();
	entwicklung2.printProjekt();
	
	//Ein Kernobjekt spielt eine weitere Rolle
	System.out.println("\nSchulze erhaelt "
			+ "zusaetzliche Aufgaben im Verkauf:");
	Verkauf verkauf1 = new Verkauf(15000);
	verkauf1.setMitarbeiter(schulze);
	
	//Ausgabe der Umsatzzahlen
	System.out.println("\nNur Schulze ist in der "
			+ "Abteilung Verkauf:");
	verkauf1.printUmsatz();
	}
	
}
