import java.net.*;
import java.nio.file.*;
import java.io.IOException;
import java.net.MalformedURLException;
/**
 * classe FetchUrl qui va prendre deux arguments au lancement:
 * - une url
 * - un nom de fichier 
 * Elle va récupérer la page web et l'enregistrer dans un fichier avec comme nom le second paramètre.
 */
class FetchUrl{
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("Mauvais nombre d'arguments: 2 arguments requis.");
			return;
		}

		try{
			URL url = new URL(args[0]);
			Path path = FileSystems.getDefault().getPath(args[1]);

			//Probleme lors de l'écriture sur le fichier, il manquait des morceaux
			//String content = new String(url.openConnection().getInputStream().readAllBytes());
			//System.out.println(content);
			//Files.newBufferedWriter(path).write(content, 0, content.length());

			Files.deleteIfExists(path);
			Files.createFile(path);
			Files.write(path, url.openConnection().getInputStream().readAllBytes());
		} catch (MalformedURLException e) {
			System.out.println("Url mal formée" + e);
		}catch (IOException e){
			System.out.println(e);
		}
	}
}