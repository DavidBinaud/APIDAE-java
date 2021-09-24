/**
 * classe TermineAvec, qui étant donné deux strings, vérifie si la première se termine par la deuxième tout en ignorant la casse.
 */
public class TermineAvecIgnorerLaCasse{
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("Mauvais nombre d'arguments, mot mot");
		} else {
			System.out.println(args[0].toLowerCase().endsWith(args[1].toLowerCase()) ? args[0] + " se termine bien en " + args[1] : args[0] + " ne se termine pas en " + args[1]);
		}
	}
}