package command;

public class LichtEinBefehl implements IBefehl {
	private LichtQuelle licht;
	public LichtEinBefehl(LichtQuelle licht) {
		this.licht=licht;
	}

	@Override
	public void fuhreAus() {
		licht.ein();
		
	}

}
