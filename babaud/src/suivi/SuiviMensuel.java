package suivi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviMensuel implements Serializable {
	
	/**
	 * ID de la classe pour la sérialisation
	 */
	private static final long serialVersionUID = 5172061584260726974L;
	protected List<SuiviJournalier> lesJours;
	
	public SuiviMensuel() {
		lesJours = new ArrayList<SuiviJournalier>();
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());lesJours.add(new SuiviJournalier());
		lesJours.add(new SuiviJournalier());
	}

	public double LireTemperature(int jour, int heure,int minute) {
		return lesJours.get(jour).LireTemperature(heure,minute);
	}

	public void AjoutNouvelleMesure(int jour, int heure,int minute, double uneTemperature) {
		lesJours.get(jour).AjoutNouvelleMesure(heure,minute, uneTemperature);
	}
	
	public double TemperatureMoyenne() {
		double i = 0.0;
		int j = 0;
		for (SuiviJournalier s : lesJours) {
			 i+=s.TemperatureMoyenne();
			 j++;
		}
		return (i/j);
	}
	
	public double TemperatureMoyenne(int jour) {
		return lesJours.get(jour).TemperatureMoyenne();
	}

	public double TemperatureMoyenne(int jour,int heure) {
		return lesJours.get(jour).TemperatureMoyenne(heure);
	}
	
	/**  READ_OBJECT
	 *  on surcharge readObject pour forcer à lire les champs de la classe dans le même ordre qu'on les a écrit.
	 * 
	 * @param ois
	 * 		ois: le stream dans lequel on va lire l'object
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		this.lesJours = (List<SuiviJournalier>) ois.readObject();
	}
	
	/** WRITEOBJECT
	 *  on surcharge writeObject pour forcer l'écriture dans champs dans un certains ordre
	 *  ordre respecté lors de la lecture de l'objet (readObject)
	 * @param oos
	 * 		oos : le stream dans lequel on écrit l'object
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeObject(lesJours);
	}
	
}
