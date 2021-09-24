/**
 * classe DernierIndexDans qui, étant donné une string et un caratère, 
 *donne la dernière position du caractère dans la string ou -1 si il n'y en a pas. 
 *La première position étant numérotée 0.
*/
public class DernierIndexDans{
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("Mauvais nombre d'arguments, mot lettre");
		} else {
			System.out.println("Le dernier " + args[1] + " dans testeur se trouve à la position " + args[0].lastIndexOf(args[1]));
		}
	}
}