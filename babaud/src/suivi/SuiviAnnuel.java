package suivi;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SuiviAnnuel implements Serializable {
	
	/**
	 * ID de la classe pour la sérialisation
	 */
	private static final long serialVersionUID = 3393144333862854310L;
	protected List<SuiviMensuel> lesMois;
	
	public SuiviAnnuel() {
		lesMois = new ArrayList<SuiviMensuel>();
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
		lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());lesMois.add(new SuiviMensuel());
	}

	public double LireTemperature(int mois, int jour, int heure,int minute) {
		return lesMois.get(mois).LireTemperature(jour,heure,minute);
	}

	public void AjoutNouvelleMesure(int mois, int jour, int heure,int minute,double uneTemperature) {
		lesMois.get(mois).AjoutNouvelleMesure(jour, heure, minute, uneTemperature);
	}
	
	public double TemperatureMoyenne() {
		double i = 0.0;
		int j = 0;
		for (SuiviMensuel s : lesMois) {
			 i+=s.TemperatureMoyenne();
			 j++;
		}
		return (i/j);
	}
	
	public double TemperatureMoyenne(int mois) {
		return lesMois.get(mois).TemperatureMoyenne();
	}

	public double TemperatureMoyenne(int mois,int jour) {
		return lesMois.get(mois).TemperatureMoyenne(jour);
	}
	
	public double TemperatureMoyenne(int mois, int jour, int heure) {
		return lesMois.get(mois).TemperatureMoyenne(jour,heure);
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
		this.lesMois = (List<SuiviMensuel>) ois.readObject();
	}
	
	/** WRITEOBJECT
	 *  on surcharge writeObject pour forcer l'écriture dans champs dans un certains ordre
	 *  ordre respecté lors de la lecture de l'objet (readObject)
	 * @param oos
	 * 		oos : le stream dans lequel on écrit l'object
	 * @throws IOException
	 */
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.writeObject(lesMois);
	}
}