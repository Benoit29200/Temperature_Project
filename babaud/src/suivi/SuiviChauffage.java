package suivi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SuiviChauffage implements Serializable {
	
	/**
	 * ID de la classe pour la sérialisation
	 */
	private static final long serialVersionUID = -6082971622435317763L;
	protected Map<Integer, SuiviAnnuel> lesAnnees = new HashMap<>();
	
	public SuiviChauffage() {
	}

	public double LireTemperature(int annee, int mois, int jour, int heure,int minute) {
		return lesAnnees.get(annee).LireTemperature(mois,jour,heure,minute);
	}

	public void AjoutNouvelleMesure(int annee, int mois, int jour, int heure,int minute,double uneTemperature) {
		if (lesAnnees.get(annee)==null) {
			SuiviAnnuel unSuiviAnnuel = new SuiviAnnuel();
			lesAnnees.put(annee, unSuiviAnnuel);
		}
		lesAnnees.get(annee).AjoutNouvelleMesure(mois, jour, heure, minute, uneTemperature);
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
		this.lesAnnees = (Map<Integer, SuiviAnnuel>) ois.readObject();
	}
	
	/** WRITEOBJECT
	 *  on surcharge writeObject pour forcer l'écriture dans champs dans un certains ordre
	 *  ordre respecté lors de la lecture de l'objet (readObject)
	 * @param oos
	 * 		oos : le stream dans lequel on écrit l'object
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeObject(lesAnnees);
	}
}
