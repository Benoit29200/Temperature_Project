package controle;

public class Simulateur {
	
	// la temperature au niveau de la sonde
	protected double temperature = 10.0;
	// l'état de la vanne de chauffage
	protected boolean etatVanne = false;
	
	public Simulateur() {
	}
	
	public double LireTemperature() {
		return temperature;
	}
	
	public void NouvelleTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public boolean Ouvre() {
		if (!etatVanne) {
			System.out.println("ouverture");
		}
		this.etatVanne = true;
		return (this.etatVanne);
	}
	
	public boolean Ferme() {
		if (etatVanne) {
			System.out.println("fermeture");
		}
		this.etatVanne = false;
		return (this.etatVanne);
	}
	
	public void changeTemperature() {
		if (etatVanne) {
			temperature++;
		} else {
			temperature--;
		}
	}

}
