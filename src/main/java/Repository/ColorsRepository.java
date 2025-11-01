package Repository;

import Model.Colors;
import Database.Database;

public class ColorsRepository implements Repository<Colors> {
    private Colors colors;
    private Database connection;
    public ColorsRepository(Colors colors, Database connection) {
        this.colors = colors;
        this.connection = connection;
    }

    @Override
    public void FindAll() {

    }

    @Override
    public void FindById(int id) {

    }

    @Override
    public void Save(Colors colors) {

    }

    @Override
    public void Delete(Long id) {

    }
}