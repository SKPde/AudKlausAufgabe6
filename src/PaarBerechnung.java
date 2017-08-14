
public class PaarBerechnung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReelleZahl a = new ReelleZahl(4.0);
		ReelleZahl b = new ReelleZahl(6.0);
		ReelleZahl r = new ReelleZahl(6500.0);

		Paar p = new Paar(a, b);
		Zahl z;
		
		do {
			z = p.mul(p);
			System.out.println(z);
			p.verschiebe(z);
			
		} while (!z.equals(r));
		
		

	}

}
