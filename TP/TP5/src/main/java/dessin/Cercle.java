package dessin;

import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Cercle extends ObjetGraphique{

    private Point2D centre;

    private int rayon;

    public Cercle(Point2D centre, int rayon, Color couleur) {
        super(couleur);
        this.centre = centre;
        this.rayon = rayon;
    }

    public Cercle(Point2D centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public void dessineToi(GraphicsContext context) {
        context.setFill(this.getCouleur());
        context.fillOval(centre.getX() - rayon, centre.getY() - rayon, rayon, rayon);
    }

    @Override
    public boolean contient(int x, int y) {
        return Math.pow(x - centre.getX(), 2) + Math.pow(y - centre.getY(), 2) <= Math.pow(rayon, 2);
    }
}
