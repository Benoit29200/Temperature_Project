package suivi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviHoraire implements Serializable {
	
	/**
	 * ID de la classe pour la sérialisation
	 */
	private static final long serialVersionUID = -3998440616670608057L;
	protected List<SuiviMinute> lesMinutes;
	
	public SuiviHoraire() {
		lesMinutes = new ArrayList<SuiviMinute>();
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
		lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());lesMinutes.add(new SuiviMinute());
	}
		
	public double LireTemperature(int minute) {
		return lesMinutes.get(minute).LireTemperature();
	}

	public void AjoutNouvelleMesure(int minute,double uneTemperature) {
		lesMinutes.get(minute).AjoutNouvelleMesure(uneTemperature);
	}
	
	public double TemperatureMoyenne() {
		double i = 0.0;
		int j = 0;
		for (SuiviMinute s : lesMinutes) {
			 i+=s.TemperatureMoyenne();
			 j++;
		}
		return (i/j);
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
		this.lesMinutes = (List<SuiviMinute>) ois.readObject();
	}
	
	/** WRITEOBJECT
	 *  on surcharge writeObject pour forcer l'écriture dans champs dans un certains ordre
	 *  ordre respecté lors de la lecture de l'objet (readObject)
	 * @param oos
	 * 		oos : le stream dans lequel on écrit l'object
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeObject(lesMinutes);
	}
	
}
