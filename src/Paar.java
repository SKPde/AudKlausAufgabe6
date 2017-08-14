
public class Paar {

	private Zahl a, b;

	public Paar(Zahl a, Zahl b) {
		this.a = a;
		this.b = b;
	}

	public void verschiebe (Zahl s) {
		
		
	}
	
	public Zahl mul(Paar p) {
		Zahl ac = a.mul(p.a);
		Zahl bd = b.mul(p.b);
		
		return ac.mul(bd);
		
	}
}
