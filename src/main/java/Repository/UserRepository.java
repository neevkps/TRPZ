package Repository;

import Model.User;
import Database.Database;

public class UserRepository implements Repository<User> {
    private User user;
    private Database connection;
    public UserRepository(User user, Database connection) {
        this.user = user;
        this.connection = connection;
    }
    @Override
    public void FindAll() {

    }

    @Override
    public void FindById(int id) {

    }

    @Override
    public void Save(User user) {

    }

    @Override
    public void Delete(Long id) {

    }
}