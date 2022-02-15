package dessin;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class ObjetGraphique {

    private Color couleur;

    private boolean visible;

    public ObjetGraphique(Color couleur) {
        this.couleur = couleur;
        this.visible = true;
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

    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public boolean isVisible() {
        return visible;
    }

    public abstract void dessineToi(GraphicsContext context);

    public abstract boolean contient(int x, int y);
}
