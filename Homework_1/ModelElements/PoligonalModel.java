package Homework_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

/**
 * PoligonalModel
 */
public class PoligonalModel {
    ArrayList<Poligon> poligons = new ArrayList<>();
    ArrayList<Texture> textures = new ArrayList<>();  

    public PoligonalModel(List<Texture> textures) {
        this.poligons = new ArrayList<>();
        this.textures = (ArrayList<Texture>) textures;
    }
    
}