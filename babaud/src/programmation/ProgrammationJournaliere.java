package programmation;

import java.util.ArrayList;
import java.util.List;

public class ProgrammationJournaliere {
	
	protected List<ProgrammationHoraire> lesHeures;
	
	public ProgrammationJournaliere() {
		lesHeures = new ArrayList<ProgrammationHoraire>();
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
		lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());lesHeures.add(new ProgrammationHoraire());
	}

	public double LireTemperature(int heure) {
		return lesHeures.get(heure).LireTemperature();
	}

	public void AjoutNouvelleTemperature(int heure,double uneTemperature) {
		lesHeures.get(heure).AjoutNouvelleTemperature(uneTemperature);
	}
}
