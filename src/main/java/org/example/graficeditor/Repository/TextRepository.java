package org.example.graficeditor.Repository;

import org.example.graficeditor.Model.Text;
import org.example.graficeditor.Database.Database;

public class TextRepository implements Repository<Text> {
    private Text text;
    private Database connection;
    public TextRepository(Text text, Database connection) {
        this.text = text;
        this.connection = connection;
    }
    @Override
    public void FindAll() {

    }

    @Override
    public void FindById(int id) {

    }

    @Override
    public void Save(Text text) {

    }

    @Override
    public void Delete(Long id) {

    }
}