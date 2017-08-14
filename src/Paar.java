
public class Paar {

	private Zahl a, b;

	public Paar(Zahl a, Zahl b) {
		this.a = a;
		this.b = b;
	}

	public void verschiebe (Zahl s) {
		a = a.add(s);
		b = b.add(s);
	}
	
	public Zahl mul(Paar p) {
		Zahl ac = a.mul(p.a);
		Zahl bd = b.mul(p.b);
		
		return ac.add(bd);
		
	}
}
