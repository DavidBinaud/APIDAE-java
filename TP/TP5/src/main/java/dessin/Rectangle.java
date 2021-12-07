package dessin;

import javafx.geometry.Rectangle2D;
import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends ObjetGraphique{

    private Rectangle2D rectangle;

    @Override
    public void dessineToi(GraphicsContext context) {

    }

    @Override
    public boolean contient(int x, int y) {
        return false;
    }
}
