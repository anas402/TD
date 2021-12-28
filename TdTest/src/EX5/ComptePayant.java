package EX5;

public class ComptePayant extends Compte {
	public ComptePayant()
	{
		super();
		
	}
	
	public ComptePayant(double solde)
	{
		super(solde);
	}
	
	public String toString()
	{
		return "Compte Payant: " + super.toString();
	}

	
	public void deposer(double somme)
	{
		super.deposer(somme);
		super.retirer(20);
	}

	
	public void retirer(double somme)
	{
		super.retirer(somme);
		super.retirer(20);
	}

}
