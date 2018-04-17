package ro.cluj.pattern.template;

public abstract class Urlaubskarte {
	final public void karteSchreiben() {
		textSchreiben();
		zusatzSchreiben();
	}

	private void textSchreiben() {
		System.out.println("Ich bin gut an meinem Urlaubsziel angekommen");
		System.out.println("Das Essen schmeckt gut und die Gegend gefaellt mir");
	}
	
	abstract protected void zusatzSchreiben();
	
	

}
