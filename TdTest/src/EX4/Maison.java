package EX4;

public class Maison extends Batiment {
	
	private int nbrePieces;

	public int getNbrePieces() {
		return nbrePieces;
	}

	public void setNbrePieces(int value) {
		nbrePieces = value;
	}
    
	public Maison() {
		
		super();
	}
	
	public Maison (String adresse,String nom ,int nbp) {
		super(adresse,nom);
		
		nbrePieces = nbp;
		
	}
	
	public String toString()
	{
		return super.toString() + ". Nombre de piéces: " + nbrePieces+"\n";
	}
	
}	
