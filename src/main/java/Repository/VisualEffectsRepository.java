package Repository;

import Model.VisualEffects;
import Database.Database;

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