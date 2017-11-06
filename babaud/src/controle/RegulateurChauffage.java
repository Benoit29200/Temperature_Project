package controle;

public class RegulateurChauffage {
	
	// consigne de température à appliquer
	protected double consigne = 0.0;
	// seuil au delà duquel il n'est pas utile de réguler
	protected double seuil = 0.0;
	// capteur de température
	protected DriverCapteur leCapteur;
	// vanne de chauffage
	protected DriverVanne laVanne;
	
	public RegulateurChauffage(Simulateur unSimulateur) {
		laVanne = new DriverVanne(unSimulateur);
		leCapteur = new DriverCapteur(unSimulateur);
	}
	
	public double valeurConsigne() {
		System.out.println("");
		return consigne;
	}
	public void MiseAJourConsigne(double temperature) {
		this.consigne = temperature;
	}
	public double valeurSeuil() {
		return seuil;
	}
	public void MiseAJourSeuil(double ecartTemperature) {
		this.seuil = ecartTemperature;
	}

	public boolean ControleVanne() {
		boolean result = true;
		if (leCapteur.LireTemperature() > (consigne+seuil) ) {
			result = laVanne.Ferme();			
		} else if (leCapteur.LireTemperature() < (consigne-seuil) ) {
			result = laVanne.Ouvre();	
		}
		return result;
	}
}
