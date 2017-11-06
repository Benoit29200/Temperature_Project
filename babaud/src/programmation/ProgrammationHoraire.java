package programmation;

public class ProgrammationHoraire {
	
	protected double temperature = 9.0;
	
	public ProgrammationHoraire() {
	}
		
	public double LireTemperature() {
		return temperature;
	}

	public void AjoutNouvelleTemperature(double uneTemperature) {
		temperature = uneTemperature;
	}
}
