package Repository;

import Model.Figures;
import Database.Database;

public class FiguresRepository implements Repository<Figures> {
    private Figures figures;
    private Database connection;
    public FiguresRepository(Figures figures, Database connection) {
        this.figures = figures;
        this.connection = connection;
    }
    @Override
    public void FindAll() {

    }

    @Override
    public void FindById(int id) {

    }

    @Override
    public void Save(Figures figures) {

    }

    @Override
    public void Delete(Long id) {

    }
}