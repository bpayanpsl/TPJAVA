public class Conditionnelle2 {
	public static void main(String args[]) {
		
		int value = Integer.parseInt(args[0]);
		
		/* Le but de ce TP est d’utiliser les instructions : switch ... case … default ....
		L'exercice consiste à calculer une taille de sac en fonction d’un poids d’entrée.
		On définit la taille en fonction d’un poid (entier) :
			 "petit" pour un poid de 1kg,
			 "moyen" pour un poid de 2kg,
			 "grand" pour un poid supérieur à 2kg.*/
		
		switch (value)
		{
			case 1 : 
				System.out.println("Petit sac");
				break;
			case 2 :
				System.out.println("Sac moyen");
				break;
			case 0 :
				System.out.println("La valeur saisie ne peut pas être nulle.");
				break;
			default :
				System.out.println("Grand sac");
				break;
		}	
	}
}