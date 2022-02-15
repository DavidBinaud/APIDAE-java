package toto;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Toto extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button();
        btn.setText("Fermer");
        btn.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        Canvas canvas = new Canvas(400,400);
        TotoJPanel panel = new TotoJPanel(canvas.getGraphicsContext2D());
        panel.paintComponent();

        panel.setCenter(canvas);
        panel.setBottom(btn);

        panel.setAlignment(btn, Pos.CENTER);

        StackPane root = new StackPane();
        root.getChildren().add(panel);

        Scene scene = new Scene(root, 400, 400);

        stage.setTitle("Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
