import java.sql.SQLException;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws SQLException {
        ProdUtils.getAllProduct().stream().forEach((Product) -> {
            System.out.println();
        });
    }

}