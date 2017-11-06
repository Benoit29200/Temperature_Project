package programmation;

import java.util.ArrayList;
import java.util.List;

public class ProgrammationHebdomadaire {
	
	protected List<ProgrammationJournaliere> lesJours;
	
	public ProgrammationHebdomadaire() {
		lesJours = new ArrayList<ProgrammationJournaliere>();
		lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());
		lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());lesJours.add(new ProgrammationJournaliere());
		lesJours.add(new ProgrammationJournaliere());
	}

	public double LireTemperature(int jour, int heure) {
		return lesJours.get(jour).LireTemperature(heure);
	}

	public void AjoutNouvelleTemperature(int jour, int heure,double uneTemperature) {
		lesJours.get(jour).AjoutNouvelleTemperature(heure, uneTemperature);
	}
}
