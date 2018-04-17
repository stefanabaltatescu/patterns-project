package command;

public class LichtAusBefehl implements IBefehl {
	private LichtQuelle licht;
	public LichtAusBefehl(LichtQuelle licht) {
		this.licht=licht;
	}
	public void fuhreAus() {
		licht.aus();
		
	}

}
