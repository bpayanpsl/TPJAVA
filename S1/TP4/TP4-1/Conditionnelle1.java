public class Conditionnelle1 {
	public static void main(String args[]) {
		
		float value = Float.parseFloat(args[0]);
		float remise = 0;
		float total = value;
		
		/*Première partie : "if"
		Le but de ce TP est d’utiliser les instructions : if ... else ....
		L'exercice consiste à calculer un montant en fonction d’un paramètre.
		On établit une remise dont le taux dépend du montant, à savoir :
			 0 % pour un montant inférieur à 1 000 €,
			 1 % pour un montant supérieur ou égal à 1 000 € et inférieur à 2 000 €,
			 3 % pour un montant supérieur ou égal à 2 000 € et inférieur à 5 000 €,
			 5 % pour un montant supérieur ou égal à 5 000 €.*/
		
		if (value >= 1000 && value < 2000)
		{
			remise = 0.01f;
			total = value*remise;			
		}
		else if (value >= 2000 && value <5000)
		{
			remise = 0.03f;
			total = value*remise;	
		}
		else if (value >= 5000)
		{
			remise = 0.05f;
			total = value*remise;
		}
		System.out.println("Vous bénéficiez d'une remise de "+remise);
		System.out.println("Soit "+total+" euros.");		
	}
}