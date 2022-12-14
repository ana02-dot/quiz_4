import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public final class ProdUtils {
    private static final String CREATE_TABLE = "CREATE TABLE PRODUCTS(\" +\n" +
            "                \"ID LONG NOT NULL AUTO_INCREMENT,\" +\n" +
            "                \"CODE VARCHAR(255), PRICE DOUBLE,\" +\n" +
            "                \"NAME VARCHAR(255), PRIMARY KEY(ID))";
    private ProdUtils() {
    }


    public static void createTable() throws SQLException{
        try {
            JDBCConfig.getStatement().executeUpdate("CREATE TABLE PRODUCT(ID LONG NOT NULL AUTO_INCREMENT," +
                    "CODE VARCHAR(255),PRICE DOUBLE,NAME VARCHAR(255),PRIMARY KEY(ID))");
            System.out.println("create table in given database");

            } catch(SQLException e){
                throw new RuntimeException(e);
            }


        }

        private static void insert (Product product){

        String var1 = Product.getProdName();
            String insertTable = "INSERT INTO PRODUCT(NAME, ID, CODE, PRICE) VALUES(" +
                    "" + Product.getProdName() + "'," +
                    "" + Product.getProdID() + "'," +
                    "" + Product.getProdCode() + "" +
                    "" + Product.getProdPrice();
            try {
                JDBCConfig.getStatement().executeUpdate(insertTable);
                System.out.println("Table updated");
                }catch(SQLException e){
                    throw new RuntimeException(e);
                }
            }


            public static List<Product> getAllProduct () throws SQLException {

                String select = "SELECT * FROM PRODUCT";

                List<Product> products = new ArrayList<>();

                try {
                    ResultSet resultSet = JDBCConfig.getStatement().executeQuery(select);


                    while (resultSet.next()) {

                        products.add(new Product(
                                resultSet.getLong("ID"),
                                resultSet.getString("NAME"),
                                resultSet.getDouble("PRICE"),
                                resultSet.getString("CODE")
                        ));

                    }
                    return products;

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }



        public static void updateProducts ( long ProdID, String ProdName){
            String update = "UPDATE PRODUCT SET NAME = '" + ProdName + "'WHERE ID = " + ProdID;
            try {
                JDBCConfig.getStatement().executeUpdate(update);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        public static void deleteProducts ( long ProdID) {

            String delete = "DELETE FROM PRODUCT WHERE ID = " + ProdID;

            try {
                JDBCConfig.getStatement().executeUpdate(delete);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }


    }
}


