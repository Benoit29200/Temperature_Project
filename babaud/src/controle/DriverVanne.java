package controle;

public class DriverVanne {

	protected Simulateur leSimulateur;

	public DriverVanne(Simulateur leSimulateur) {
		this.leSimulateur = leSimulateur;
	}

    public boolean Ouvre() {
    	return (leSimulateur.Ouvre());
    }
    public boolean Ferme() {
    	return (leSimulateur.Ferme());
    }
}
