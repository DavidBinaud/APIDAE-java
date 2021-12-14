package toto;

import dessin.Cercle;
import dessin.Rectangle;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

public class TotoJPanel extends BorderPane {

    public TotoJPanel() {
        super();
        Canvas canvas = new Canvas(400,400);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        Cercle cercle1 = new Cercle(new Point2D(200, 200), 100);
        Cercle cercle2 = new Cercle(new Point2D(160, 150), 20);
        Cercle cercle3 = new Cercle(new Point2D(240, 150), 20);
        Rectangle rectangle = new Rectangle(150, 220, 100, 40);

        cercle1.dessineToi(gc);
        cercle2.dessineToi(gc);
        cercle3.dessineToi(gc);
        rectangle.dessineToi(gc);
        this.setCenter(canvas);
    }
}
