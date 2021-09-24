import java.util.regex.*;  
/**
 * classe Calcul, qui retourne le résultat d'une opération donnée en paramètre
 * Il gére les opérateurs : + - * et /
 * Il supporte des opérandes à virgule (on se limitera au cas où seulement 2 opérandes et un opérateur sont donnés en paramètres)
 */
public class Calcul{
	public static void main(String[] args) {
		if(args.length != 3){
			System.out.println("Mauvais nombre d'arguments, veuillez formater comme tel: opérande1 opérateur opérande2\n opérateur peut être + - * /");
		} else {
			char operateur = args[1].charAt(0);
			
			if(args[0].indexOf('.') == -1){
				int operande1;
				try{
					operande1 = Integer.parseInt(args[0]);
				} catch (NumberFormatException e){
					System.out.println("Mauvais format d'operande 1");
					return;
				}

			} else {
				float operande1;
				try{
					operande1 = Float.parseFloat(args[0]);
				}catch(NumberFormatException e){
					System.out.println("Mauvais format d'operande 1");
					return;
				}
			}

			if(args[2].indexOf('.') == -1){
				int operande2;
				try{
					operande2 = Integer.parseInt(args[2]);
				} catch (NumberFormatException e){
					System.out.println("Mauvais format d'operande 2");
					return;
				}

			} else {
				float operande2;
				try{
					operande2 = Float.parseFloat(args[2]);
				}catch(NumberFormatException e){
					System.out.println("Mauvais format d'operande 2");
					return;
				}
			}
			System.out.println("Le résultat de l'opération " + operande1 + " "  + operateur + " " + operande2 + " est " + calcul(operande1, operateur, operande2));
			
		}
	}

	private static int calcul(int operande1, char operateur, int operande2){
		int result = 0;
		switch(operateur){
			case '+': result = operande1 + operande2;
				break;
			case '-': result = operande1 - operande2;
				break;
			case '*': result = operande1 * operande2;
				break;
			case '/': result = operande1 / operande2;
				break;
		}
		return result;
	}

	private static float calcul(float operande1, char operateur, float operande2){
		float result = 0f;
		switch(operateur){
			case '+': result = operande1 + operande2;
				break;
			case '-': result = operande1 - operande2;
				break;
			case '*': result = operande1 * operande2;
				break;
			case '/': result = operande1 / operande2;
				break;
		}
		return result;
	}

	private static float calcul(int operande1, char operateur, float operande2){
		float result = 0f;
		switch(operateur){
			case '+': result = operande1 + operande2;
				break;
			case '-': result = operande1 - operande2;
				break;
			case '*': result = operande1 * operande2;
				break;
			case '/': result = operande1 / operande2;
				break;
		}
		return result;
	}

	private static float calcul(float operande1, char operateur, int operande2){
		float result = 0f;
		switch(operateur){
			case '+': result = operande1 + operande2;
				break;
			case '-': result = operande1 - operande2;
				break;
			case '*': result = operande1 * operande2;
				break;
			case '/': result = operande1 / operande2;
				break;
		}
		return result;
	}
}