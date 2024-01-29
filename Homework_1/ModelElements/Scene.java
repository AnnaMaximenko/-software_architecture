package Homework_1.ModelElements;

import java.util.ArrayList;
import java.util.List;


public class Scene {
    int Id;
    List<PoligonalModel> poligonalModel=new ArrayList<>();
    List<Flash> flashes = new ArrayList<>();
    List<Camera> camera = new ArrayList<>();

     public Scene(int id, List<PoligonalModel> models, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.Id = id;
        if (models.size() > 0) {
            this.poligonalModel = models;
        } else {
            throw new Exception("Вы не ввели модель");
        }
        this.flashes = flashes;
        if (cameras.size() > 0) {
            this.camera = cameras;
        } else {
            throw new Exception("Вы не ввели модель");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }
}
