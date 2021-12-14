package toto;

import dessin.Cercle;
import dessin.ObjetGraphique;
import dessin.Rectangle;
import javafx.geometry.Point2D;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;

import java.util.ArrayList;

public class TotoJPanel extends BorderPane {

    private ArrayList<ObjetGraphique> objetGraphiques;

    public TotoJPanel() {
        super();
        objetGraphiques = new ArrayList<>();
        objetGraphiques.add(new Cercle(new Point2D(200, 200), 100));
        objetGraphiques.add(new Cercle(new Point2D(160, 150), 20));
        objetGraphiques.add(new Cercle(new Point2D(240, 150), 20));
        objetGraphiques.add(new Rectangle(150, 220, 100, 40));
    }

    public void paintComponent(GraphicsContext gc){
        for (ObjetGraphique objetGraphique: objetGraphiques) {
            objetGraphique.dessineToi(gc);
        }
    }


}
