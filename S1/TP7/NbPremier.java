public class NbPremier {
	public static void main(String args[]) {
	
		/*Le but de ce TP est de produire un algorithme basé sur  les instructions de bases.

		L'exercice consiste à calculer et afficher les n premiers nombres premiers.

		Récupérer le chiffre passée en ligne de commande.
		Afficher la liste des n nombres premiers (n étant la valeur récupérée).*/
		
		int value = Integer.parseInt(args[0]);
		
		int nbPremier = 0;
		int nbToTest = 2;
		
		while(nbPremier < value){
			boolean divided = false;
			for(int j = 2; j < nbToTest; j++){
				if(nbToTest % j == 0){
					divided = true;
					continue;
				}
			}
			if (divided == false){
				System.out.println("Nombre premier : "+nbToTest);
				nbPremier++;
			}
			nbToTest++;
		}			
	}
}