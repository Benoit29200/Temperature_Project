package tests;

import controle.RegulateurChauffage;
import controle.Simulateur;

public class testRegulation {

	public static void main(String[] args) {
		
		int nombreCycles = 50;

		Simulateur unSimulateur = new Simulateur();
		RegulateurChauffage unChauffage = new RegulateurChauffage(unSimulateur);
		unChauffage.MiseAJourConsigne(18);
		unChauffage.MiseAJourSeuil(1);
		
		for (int i = 0; i < nombreCycles; i++) {
			unSimulateur.changeTemperature();
			unChauffage.ControleVanne();
			System.out.println(unSimulateur.LireTemperature());
		}
	}

}
