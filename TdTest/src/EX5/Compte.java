package EX5;

public class Compte {
	
		
		private int code;
		private double solde;
		private int nbcomptes = 0;
		
		public int getCode() {
			return code;
		}
		public void setCode(int code) {
			this.code = code;
		}
		public double getSolde() {
			return solde;
		}
		public void setSolde(double solde) {
			this.solde = solde;
		}
		public int getNbcomptes() {
			return nbcomptes;
		}
		public void setNbcomptes(int nbcomptes) {
			this.nbcomptes = nbcomptes;
		}
	    
		public Compte()
		{
			nbcomptes++;
			code = nbcomptes;
		}

		public Compte(double solde)
		{
			nbcomptes++;
			code = nbcomptes;
			this.solde = solde;
		}
		
		public void deposer(double somme) 
		{
			solde += somme;
		}

		public void retirer(double sommme) 
		{
			solde -= sommme;
		}

		
		public String toString()
		{
			return "Code: " + code + " Solde: " + solde;
		}
	}



