package toto;

import dessin.Cercle;
import dessin.ObjetGraphique;
import dessin.Rectangle;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Point2D;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.ArrayList;

public class TotoJPanel extends BorderPane {

    private ArrayList<ObjetGraphique> objetGraphiques;

    private GraphicsContext gc;

    public TotoJPanel(GraphicsContext gc) {
        super();
        this.gc = gc;
        objetGraphiques = new ArrayList<>();

        Cercle head = new Cercle(new Point2D(200, 200), 100, Color.GREEN);
        objetGraphiques.add(head);

        Cercle leftEye = new Cercle(new Point2D(160, 150), 20, Color.BLUE);
        objetGraphiques.add(leftEye);

        Cercle rightEye = new Cercle(new Point2D(240, 150), 20, Color.RED);
        objetGraphiques.add(rightEye);

        Rectangle mouth = new Rectangle(150, 220, 100, 40);
        objetGraphiques.add(mouth);

        VBox vbox = new VBox(5);

        String[] buttonNames = {"head", "leftEye", "rightEye", "mouth"};
        for (int i = 0; i < 4; i++) {
            Button button = new Button();
            ObjetGraphique target = objetGraphiques.get(i);
            button.setText(buttonNames[i]);
            button.setOnAction(new EventHandler<>() {
                @Override
                public void handle(ActionEvent actionEvent) {
                    target.setVisible(!target.isVisible());
                    paintComponent();
                }
            });
            vbox.getChildren().add(button);
        }

        this.setLeft(vbox);

        this.gc.getCanvas().setOnMouseClicked(new EventHandler<>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                for (ObjetGraphique objet: objetGraphiques) {
                    if(objet.isVisible() && objet.contient((int)mouseEvent.getX(), (int)mouseEvent.getY())){
                        objet.changeColor();
                    }
                }
                paintComponent();
            }
        });
    }

    public void paintComponent(){
        this.clear();
        for (ObjetGraphique objetGraphique: objetGraphiques) {
            if (objetGraphique.isVisible()) {
                objetGraphique.dessineToi(gc);
            }
        }
    }

    public void clear(){
        this.gc.clearRect(0,0,400,400);
    }


}
