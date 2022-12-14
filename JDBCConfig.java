import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class JDBCConfig {
    public static final String DB_URL = "jdbc:mysql://sql7.freesqldatabase.com:3306/sql7583723";
    public static final String DB_USER = "sql7583723";
    public static final String DB_PASSWORD = "d1LUQ8I3MD";

    private static Connection connection;
    private static Statement statement;





    public JDBCConfig() {
    }

    public static Statement statement() throws SQLException {
        try {
            statement = (Statement) connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }

    static {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection("jdbc:mysql://sql7.freesqldatabase.com:3306/sql7583723", "sql7583723", "d1LUQ8I3MD");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}