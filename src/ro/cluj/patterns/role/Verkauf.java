package ro.cluj.patterns.role;

public class Verkauf {
		private Mitarbeiter mitarbeiter;
		private int verkauf;
		
		public Verkauf(int verkauf) {
			this.verkauf = verkauf;
		}
		
		public String getAbteilungsBezeichnung(){
			return "Verkauf";
		}
		
		public void printUmsatz()
		{
			System.out.println(mitarbeiter.getName() +
				" verkauft: " + verkauf	);
		
		}
		public Mitarbeiter getMitarbeiter()
		{
			return mitarbeiter;
		}
		public void setMitarbeiter (Mitarbeiter mitarbeiter)
		{
			this.mitarbeiter = mitarbeiter;
		}
		

	}



