import junit.framework.TestCase;


public class AddiererTest extends TestCase implements Datenbank{

	public void testAddiereZahlAusDB(){
		Addierer addierer = new Addierer(this);
		int result = addierer.addiereZahlAusDB();
		
		assertEquals(5, result);
	}

	@Override
	public int getLetzteZahlInDB() {
		return 3;
	}
}
