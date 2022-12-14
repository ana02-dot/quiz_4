public class Product {
    private static long ProdID;
    private static String ProdCode;
    private static double ProdPrice;
    private static String ProdName;


    public Product(){
    }


    public Product(long prodID, String prodCode, double prodPrice, String prodName) {
        ProdID = prodID;
        ProdCode = prodCode;
        ProdPrice = prodPrice;
        ProdName = prodName;
    }

    public Product(String prodName, String prodCode, double prodPrice) {
        this.ProdName = prodName;
        this.ProdCode = prodCode;
        this.ProdPrice = prodPrice;
    }


    public static long getProdID() {
        return ProdID;
    }

    public void setProdID(long prodID) {
        this.ProdID = prodID;
    }

    public static String getProdCode() {
        return ProdCode;
    }

    public void setProdCode(String prodCode) {
        this.ProdCode = prodCode;
    }

    public static double getProdPrice() {
        return ProdPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.ProdPrice = prodPrice;
    }

    public static String getProdName() {
        return ProdName;
    }

    public void setProdName(String prodName) {
        this.ProdName = prodName;
    }


    @Override
    public String toString() {
        return "Product{" +
                "ID=" + ProdID +
                ", Name='" + ProdName + '\'' +
                ", Code='" + ProdCode + '\'' +
                ", Price=" + ProdPrice +
                '}';
    }
}

