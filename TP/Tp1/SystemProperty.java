/**
 * classe SystemProperty qui affiche les propriétés de l'OS suivantes : 
 * le nom de l'utilisateur, tel qu'il est enregistré dans l'OS, 
 * le répertoire de travail courant 
 * le numéro de version de la machine virtuelle utilisée pour lancer le programme
 */
public class SystemProperty{
	public static void main(String[] args) {
		System.out.println("username: " + System.getProperty("user.name"));
		System.out.println("userdir: " + System.getProperty("user.dir"));
		System.out.println("java version: " + System.getProperty("java.version"));
	}
}