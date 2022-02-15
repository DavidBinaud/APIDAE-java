package toto;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Toto extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        StackPane root = new StackPane();

        Scene scene = new Scene(root, 400, 400);
        stage.setTitle("Application");
        stage.setScene(scene);

        Canvas canvas = new Canvas(400,400);
        TotoJPanel panel = new TotoJPanel(canvas.getGraphicsContext2D());
        panel.setCenter(canvas);

        root.getChildren().add(panel);

        HBox hbox = new HBox();

        Button btn = new Button("Fermer");
        btn.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        hbox.getChildren().add(btn);

        CheckBox chkbox = new CheckBox("Fill");
        chkbox.setSelected(true);
        chkbox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                panel.changeFill();
            }
        });

        hbox.getChildren().add(chkbox);

        panel.setBottom(hbox);
        hbox.setAlignment(Pos.CENTER);

        panel.paintComponent();
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
