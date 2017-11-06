package tests;

import programmation.ProgrammationChauffage;

public class testProgrammation {

	public static void main(String[] args) {

		ProgrammationChauffage laProgrammation = new ProgrammationChauffage();
		
		laProgrammation.AjoutTemperatureUnique(0, 15);
		laProgrammation.AjoutNouvelleTemperature(1, 0, 11, 18.0);
		
		System.out.println(laProgrammation.LireTemperature(0, 0, 0));
		System.out.println(laProgrammation.LireTemperature(0, 5, 15));
		System.out.println(laProgrammation.LireTemperature(1, 0, 10));
		System.out.println(laProgrammation.LireTemperature(1, 0, 11));
		System.out.println(laProgrammation.LireTemperature(1, 0, 12));		
	}
}
