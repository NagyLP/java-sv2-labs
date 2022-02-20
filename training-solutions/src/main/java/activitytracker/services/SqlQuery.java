package activitytracker.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SqlQuery implements AutoCloseable {

    private final Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet result;

    public SqlQuery(Connection connection) {
        this.connection = connection;
    }

    public Connection connection() {
        return connection;
    }

    public PreparedStatement preparedStatement() {
        return preparedStatement;
    }

    public ResultSet result() {
        return result;
    }

    public void setPreparedStatement(PreparedStatement preparedStatement)
            throws SQLException {
        if (this.preparedStatement != null) this.preparedStatement.close();
        this.preparedStatement = preparedStatement;
    }

    public void setResult(ResultSet result)
            throws SQLException {
        if (this.result != null) {
            this.result.close();
        }
        this.result = result;
    }

    @Override
    public void close() throws SQLException {
        if (result != null) result.close();
        if (preparedStatement != null) preparedStatement.close();
        if (connection != null) connection.close();
    }
}
