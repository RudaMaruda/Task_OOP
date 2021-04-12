package task10;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final List<Product> collectionPr = new ArrayList<>();

    public void addProduct(Product product){
        collectionPr.add(product);
    }

    public void deleteProduct(Product product){
        if(collectionPr.contains(product)){
            collectionPr.remove(product);
            return;
        }
        System.out.println("Product not exist");

    }

    public List<Product> showProductInBasket(){
        return new ArrayList<>(collectionPr);
    }
}
