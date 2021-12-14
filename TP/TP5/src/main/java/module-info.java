module dessin {
    requires javafx.controls;
    requires javafx.fxml;


    opens dessin to javafx.fxml;
    exports dessin;
    exports toto to javafx.graphics;
}