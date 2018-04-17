package command;

public class LichtSchalter {
	private IBefehl befehl;
	
	public void speichereBefehl(IBefehl befehl) {
		this.befehl=befehl;
	}
	
	public void aktivieren() {
		befehl.fuhreAus();
	}
}
