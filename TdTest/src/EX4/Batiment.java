package EX4;

public class Batiment {
  private String adresse;
	private String nom;
  //les constructeurs:
    public Batiment () {
		
	}
    
	public Batiment (String nom,String adresse) {
		
		this.adresse = adresse;
		this.nom=nom;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String value) {
		adresse = value;
	}
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String toString()
	{
		return "nom du Batiment est:"+nom+"\nAdresse: " +adresse;
	}

}


