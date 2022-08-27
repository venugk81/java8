package streams;

import java.util.ArrayList;
import java.util.List;

public class GetProductsList {

    private static List<Product> productList = new ArrayList<>();

    public static List<Product> getList(){
        productList.add(new Product(1, "hp laptop", 30000));
        productList.add(new Product(1, "dell laptop", 40000));
        productList.add(new Product(1, "thomson laptop", 25000));
        productList.add(new Product(1, "apple laptop", 100000));
        return  productList;
    }
}
