/**
*AfficheArgs qui affiche tous les paramètres qui lui sont transmis en ligne de commande (un par ligne).
*/

public class AfficheArgs{
	
	public static void main(String[] args) {
		for (int i = 0;i < args.length; i++) {	
			System.out.println(args[i]);
		}
	}
}