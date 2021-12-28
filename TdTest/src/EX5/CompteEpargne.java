package EX5;

public class CompteEpargne extends Compte {
	
		private double tauxinteret = 5;

		public double getTauxinteret() {
			return tauxinteret;
		}

		public void setTauxinteret(double tauxinteret) {
			this.tauxinteret = tauxinteret;
		}
		
		public CompteEpargne()
		{
			super();
		}

		public CompteEpargne(double solde)
		{
			super(solde);
		}
		
		public void CalculerInteret() 
		{
			double x=super.getSolde()+super.getSolde()*tauxinteret/100;
					
			super.deposer(x);
		}

		
		public String toString() 
		{
			return "Compte Epargne: " + super.toString() + " Taux interêt: " + tauxinteret+"%";
		}

	}

	
	
	

