
public class ReelleZahl extends Zahl {

	private double value;

	public ReelleZahl(double v) {
		value = v;
	}

	@Override
	public Zahl add(Zahl zahl) { // Aditionsmethode

		ReelleZahl eingabe = (ReelleZahl) zahl;
		return new ReelleZahl(value + eingabe.value);
	}

	@Override
	public Zahl mul(Zahl zahl) { // Multiplikationsmethode

		ReelleZahl eingabe = (ReelleZahl) zahl;
		return new ReelleZahl(value * eingabe.value);

	}

	public String toString() { // String Darstellung

		return "" + value;

	}

	public boolean equals(Object zahl) { // Vergleichsmethode

		ReelleZahl eingabe = (ReelleZahl) zahl;

		return (value == eingabe.value);
	}

}
