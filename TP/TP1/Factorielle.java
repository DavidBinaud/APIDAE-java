/**
*Ce programme affichera la factorielle de n
*n étant une variable de type int dont la valeur est fixée dans le code au moment de sa déclaration
*/

public class Factorielle{

	public static void main(String[] args) {
		int n = 5;
		System.out.printf("Factorielle pour n = %d: %d\n", n, factorielle(n));
		
	}

	private static int factorielle(int n){
		if(n<2)return 1;
		return factorielle(n-1)*n;
	}
}