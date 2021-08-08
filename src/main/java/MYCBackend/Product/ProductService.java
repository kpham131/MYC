package MYCBackend.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product createProduct(Product product) {
        return repo.save(product);
    }

    public Product getProductById(int id) {
        return repo.findById(id).get();
    }

    public Product updateProduct(Product product) {
        return repo.save(product);
    }

    public void deleteProductById(int id) {
        repo.deleteById(id);
    }

    public Product changeProductStatus(int id) {
        Product temp = repo.findById(id).get();
        temp.setIsAvailable(!temp.getIsAvailable());
        return repo.save(temp);
    }

}
