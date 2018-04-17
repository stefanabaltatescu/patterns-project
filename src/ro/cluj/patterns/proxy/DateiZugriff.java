package ro.cluj.patterns.proxy;

public class DateiZugriff implements IDateiZugriff{
	
	String name;
	
	public DateiZugriff(String name) {
		this.name = name;
		System.out.println("Echtes Objekt instanziirt");
	}
	
	public String getName() {
		return this.getName();
	}
	
	public String getInhalt() {
		return ("Daten von" + name);
	}

}
