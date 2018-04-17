package command;

public class Client {
 public static void main(String[] args) {
	LichtSchalter schalter = new LichtSchalter();
	LichtQuelle licht = new LichtQuelle();
	
	IBefehl lichtAn = new LichtEinBefehl(licht);
	IBefehl lichtAus = new LichtAusBefehl(licht);
	
	schalter.speichereBefehl(lichtAn);
	schalter.aktivieren();
	
	schalter.speichereBefehl(lichtAus);
	schalter.aktivieren();
}
}
