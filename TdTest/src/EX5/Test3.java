package EX5;

public class Test3 {

	public static void main(String[] args) {
	  //creer les objet:
		Compte C1 = new Compte();
		CompteEpargne C2 = new CompteEpargne();
		ComptePayant C3 = new ComptePayant();
		C1.deposer(5000);
		C2.deposer(3000);
		C3.deposer(4000);
		C1.retirer(2000);
		C2.retirer(500);
		C3.retirer(400);
		C2.CalculerInteret();
		System.out.println(C1);
		System.out.println(C2);
		System.out.println(C3);


	}

}
