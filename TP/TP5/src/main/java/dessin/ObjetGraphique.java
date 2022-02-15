package dessin;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ObjetGraphique {

    private Color couleur;

    private boolean visible;

    private static List<Color> colors = Arrays.asList(new Color[]{Color.BLACK, Color.BLUE, Color.GREEN, Color.RED, Color.ORANGE, Color.WHITE});

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

    public void changeColor(){
        if(colors.contains(this.couleur)){
            int index = colors.indexOf(this.couleur);
            this.couleur = index + 1 >= colors.size() ? colors.get(0) : colors.get(index + 1);
        } else {
            this.couleur = colors.get(0);
        }
    }

    public abstract void dessineToi(GraphicsContext context);

    public abstract void dessineToi(GraphicsContext context, boolean fill);

    public abstract boolean contient(int x, int y);
}
