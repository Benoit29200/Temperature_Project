package tests;

import suivi.SuiviChauffage;

public class testSuivi {

	public static void main(String[] args) {

		SuiviChauffage unSuivi = new SuiviChauffage();
		
		unSuivi.AjoutNouvelleMesure(2017, 0, 0, 0,0, 14);
		
		System.out.println(unSuivi.LireTemperature(2017, 0, 0, 0,0));	
		System.out.println(unSuivi.LireTemperature(2017, 1, 3, 14,0));
	}
}
