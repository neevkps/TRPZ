package Repository;

import Model.Canvas;
import Database.Database;
public class CanvasRepository implements Repository<Canvas> {

    private Canvas canvas;
    private Database connection;
    public CanvasRepository(Canvas canvas, Database connection) {
        this.canvas = canvas;
        this.connection = connection;
    }
    @Override
    public void FindAll() {

    }

    @Override
    public void FindById(int id) {

    }

    @Override
    public void Save(Canvas canvas) {

    }

    @Override
    public void Delete(Long id) {

    }
}