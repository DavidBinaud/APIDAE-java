/**
*Ce programme affichera la factorielle de n
*n étant une variable de type int dont la valeur est prise en entrée par argument
*/

public class Factorielle2{

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("Mauvais nombre d'arguments");
		} else {
			try{
				int n = Integer.parseInt(args[0]);
				System.out.printf("Factorielle pour n = %d: %d\n", n, factorielle(n));
			} catch (NumberFormatException e){
				System.out.println("Erreur d'input, veuillez entrer un nombre valide");
			}
		}
		
	}

	private static int factorielle(int n){
		if(n<2)return 1;
		return factorielle(n-1)*n;
	}
}