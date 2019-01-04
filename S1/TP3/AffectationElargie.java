public class AffectationElargie {
	public static void main(String args[]) {
		
		/*Le but de ce TP est de visualiser le résultat d’une conversion avec une affectation élargie.
		L'exercice consiste à effectuer une affectation élargie avec des valeurs limites.

		Affecter la valeur 10 à une variable x de type byte.
		Ajouter 1000 à cette variable (avec l’opérateur +=).
		Afficher le résultat par System.out.println(...).*/
		
		byte x = 10;
		x += 0b1000; //Le premier bit d'un octet est composé du signe du nombre. Rentrer la valeur 1000 dans un bit correspond au signe '-'. Ce n'est plus le cas si 0b1000 est rentré.//
		System.out.println("byte = "+x);
	}
}	
		