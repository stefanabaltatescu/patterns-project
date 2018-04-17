package ro.cluj.patterns.proxy;

public class ProxyDateiZugriff implements IDateiZugriff {

	String name;
	IDateiZugriff realeDatei;
	
	public ProxyDateiZugriff(String name) {
		this.name = name;
		System.out.println("Stellvertretendes Objekt instanziiert");
	}
	
	public String getName() {
		return name;
	}

	@Override
	public String getInhalt() {
		if(realeDatei == null) {
			System.out.println("Inhalt liegt lokal nicht vor");
			realeDatei = new DateiZugriff(name);
		}
		return realeDatei.getInhalt();
	}
	


}
