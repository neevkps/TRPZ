package Database;

import java.sql.Connection;

public class Database {
    public Connection connection;
    public Connection getConnection() { return connection; }
    public void setConnection(Connection connection) { this.connection = connection; }
}
