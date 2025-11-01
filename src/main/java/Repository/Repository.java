package Repository;

public interface Repository<T> {
    void FindAll();
    void FindById(int id);
    void Save(T entity);
    void Delete(Long id);
}
