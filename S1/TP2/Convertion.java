public class Convertion {
	public static void main(String args[]) {
		
		//Affecter la valeur 1234 à une variable int, le stocker dans une variable de type float et
		//afficher les deux valeurs par System.out.println(...).
		int nombre = 1234;
		float nombre2 = nombre;
		System.out.println(nombre);
		System.out.println(nombre2);
		
		//Refaire la même opération avec la valeur 123456789
		int nombre3 = 123456789;
		float nombre4 = nombre3;
		System.out.println(nombre3);
		System.out.println(nombre4);
		
		//Le but de ce TP est de visualiser le résultat d’une division par zéro.
		//L'exercice consiste à effectuer une série de calcul limite.
		
		/*Affecter la valeur 15 à une variable x de type float.
		Affecter la valeur 0 à une variable z de type float.
		Affecter la valeur -123 à une variable y de type float.
		Affecter la valeur x / z à une variable a de type float.
		Affecter la valeur y / z à une variable b de type float.
		Affecter la valeur a / b à une variable c de type float.
		Afficher toutes les valeurs par System.out.println(...).*/
		float x = 15;
		float z = 0;
		float y = -123;
		float a = x/z;
		float b = y/z;
		float c = a/b;
		System.out.println("x = "+x);
		System.out.println("z = "+z);
		System.out.println("y = "+y);
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
	}
}