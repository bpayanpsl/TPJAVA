public class Factorielle {
	public static void main(String args[]) {
	
		/*Le but de ce TP est d’utiliser les instructions : for ....
		L'exercice consiste à calculer la factorielle d’un nombre.

		Il s'agit d'écrire un programme qui calcule la factorielle d'un entier et indique à l'écran le
		résultat. Le nombre n doit être lu sur la ligne de commande.*/
		
		int value = Integer.parseInt(args[0]);
		int total = 1;
		
		for(int i = 1; i <= value; i++)
		{
			total = total*i;
		}
		System.out.println(total);
	}
}