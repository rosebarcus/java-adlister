import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products{
    private List<Product> products = new ArrayList<>();

    public ListProducts(){
        insert(new Product("hammer", 9.99));
        insert(new Product("Yoshi's Crafted World", 59.99));
        insert(new Product("HORI Hayabusa 4", 149.99));
    }

    @Override
    public List<Product> all() {
        return this.products;
    }

    @Override
    public void insert(Product product){
        this.products.add(product);
    }
}
