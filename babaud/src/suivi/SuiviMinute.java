package suivi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SuiviMinute implements Serializable {
	
	/**
	 * ID de la classe pour la sérialisation de l'object
	 */
	private static final long serialVersionUID = 1982481152338136842L;
	protected double temperatureMesuree = -50.0;
	
	public SuiviMinute() {
	}
		
	public double LireTemperature() {
		return temperatureMesuree;
	}

	public void AjoutNouvelleMesure(double uneTemperature) {
		temperatureMesuree = uneTemperature;
	}
	
	public double TemperatureMoyenne() {
		return temperatureMesuree;
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
		this.temperatureMesuree =  (double) ois.readObject();
	}
	
	/** WRITEOBJECT
	 *  on surcharge writeObject pour forcer l'écriture dans champs dans un certains ordre
	 *  ordre respecté lors de la lecture de l'objet (readObject)
	 * @param oos
	 * 		oos : le stream dans lequel on écrit l'object
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeObject(temperatureMesuree);
	}
}
