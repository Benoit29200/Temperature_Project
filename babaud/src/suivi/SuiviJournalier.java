package suivi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviJournalier implements Serializable {
	
	/**
	 *  ID de la classe pour la sérialisation de l'object
	 */
	private static final long serialVersionUID = 8920258184276310108L;
	protected List<SuiviHoraire> lesHeures;
	
	public SuiviJournalier() {
		lesHeures = new ArrayList<SuiviHoraire>();
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
		lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());lesHeures.add(new SuiviHoraire());
	}

	public double LireTemperature(int heure,int minute) {
		return lesHeures.get(heure).LireTemperature(minute);
	}

	public void AjoutNouvelleMesure(int heure,int minute, double uneTemperature) {
		lesHeures.get(heure).AjoutNouvelleMesure(minute,uneTemperature);
	}
	
	public double TemperatureMoyenne() {
		double i = 0.0;
		int j = 0;
		for (SuiviHoraire s : lesHeures) {
			 i+=s.TemperatureMoyenne();
			 j++;
		}
		return (i/j);
	}
	
	public double TemperatureMoyenne(int heure) {
		return lesHeures.get(heure).TemperatureMoyenne();
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
		this.lesHeures = (List<SuiviHoraire>) ois.readObject();
	}
	
	/** WRITEOBJECT
	 *  on surcharge writeObject pour forcer l'écriture dans champs dans un certains ordre
	 *  ordre respecté lors de la lecture de l'objet (readObject)
	 * @param oos
	 * 		oos : le stream dans lequel on écrit l'object
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeObject(lesHeures);
	}	
}
