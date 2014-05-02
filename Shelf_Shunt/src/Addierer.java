
public class Addierer {

	private Datenbank db;
	
	public Addierer(Datenbank db){
		this.db = db;
	}

	public int addiereZahlAusDB(){
		int number = 2;
		number = number + db.getLetzteZahlInDB();
		return number;
	}
}
