package book3.chapter4;

public class ProductDDB {
    public static Product getProduct(String code) {

        Product p;
        try {
            p = new Product("k");
            return p;
        } catch (
                ProductDataException error) {
            return new Product();
        }

    }

    public static void main(String[] args) {
        Product p = ProductDDB.getProduct("a");
        System.out.println(p);
    }
}


class Product {
    String code;

    public Product(String code) throws ProductDataException {
        if (code.equalsIgnoreCase("z")) {
            throw new ProductDataException(
                    "An IO error occurred.");
        }
        this.code = code;
    }

    public Product() {
        this.code = "a";
    }
    public String toString() {
        return "The code is " + code;
    }
}
