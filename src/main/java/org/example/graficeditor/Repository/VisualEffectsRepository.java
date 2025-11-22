package org.example.graficeditor.Repository;

import org.example.graficeditor.Model.VisualEffects;
import org.example.graficeditor.Database.Database;

public class VisualEffectsRepository implements Repository<VisualEffects> {
    private VisualEffects visualEffects;
    private Database connection;
    public VisualEffectsRepository(VisualEffects visualEffects, Database connection) {
        this.visualEffects = visualEffects;
        this.connection = connection;
    }
    @Override
    public void FindAll() {

    }

    @Override
    public void FindById(int id) {

    }

    @Override
    public void Save(VisualEffects visual_effects) {

    }

    @Override
    public void Delete(Long id) {

    }
}