/**
 * un convertisseur hexadécimal -> décimal qui affiche la valeur décimale de plusieurs caractères hexadécimal fournit en paramètre. 
 * Par ailleurs, le programme  vérifie que le caractère passé en argument est bien un nombre hexadécimal et le signaler à l'utilisateur dans le cas contraire
 */
public class HexadecimalToIntegerBetter{
	public static void main(String[] args) {
		System.out.println(args.length);
		if(args.length != 1){
			System.out.println("Mauvais nombre d'arguments, valeur");
		} else {
			try{
				int hex = Integer.parseInt(args[0], 16);
			} catch (NumberFormatException e){
				System.out.println("Erreur: " + args[0] + " n'est pas un caractere hexadecimal.");
			}
		}
	}
}
