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
        context.fillOval(centre.getX() - rayon, centre.getY() - rayon, rayon*2, rayon*2);
    }

    @Override
    public void dessineToi(GraphicsContext context, boolean fill) {
        if(fill){
            dessineToi(context);
        } else {
            context.setStroke(this.getCouleur());
            context.strokeOval(centre.getX() - rayon, centre.getY() - rayon, rayon*2, rayon*2);
        }
    }

    @Override
    public boolean contient(int x, int y) {
        return Math.pow(x - centre.getX(), 2) + Math.pow(y - centre.getY(), 2) <= Math.pow(rayon, 2);
    }
}
