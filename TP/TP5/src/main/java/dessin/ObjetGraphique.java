package dessin;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class ObjetGraphique {

    private Color couleur;

    public ObjetGraphique(Color couleur) {
        this.couleur = couleur;
    }

    public ObjetGraphique() {
        this(Color.BLACK);
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }


    public abstract void dessineToi(GraphicsContext context);

    public abstract boolean contient(int x, int y);
}
