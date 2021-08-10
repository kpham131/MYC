package MYCBackend.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {

    //----Sua cho nay moi dung voi clip
    private final ProductRepository repo;

    @Autowired
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product createProduct(Product product) {
        repo.findByProductNameAndCollectionID(product.getProductName(), product.getCollectionID())
            .ifPresent(param->{
                throw new IllegalStateException("Product already exist");
            });
        return repo.save(product);
    }

    public Product getProductById(int id) {
//        return repo.findById(id)
//                .orElseThrow(()-> {
//                    throw new IllegalStateException("Product does not exists");
//                });
        return repo.findById(id).get();
    }

    public Product updateProduct(int id, Product product) {
        Product temp = repo.findById(id)
                .orElseThrow(()-> {
                    throw new IllegalStateException("Product does not exists");
                });
        return repo.save(product);
    }

    public void deleteProductById(int id) {
//        repo.findById(id)
//                .orElseThrow(()-> {
//                    throw new IllegalStateException("Product does not exists");
//                });
        repo.deleteById(id);
    }

    public Product changeProductStatus(int id) {
        Product temp = repo.findById(id)
                .orElseThrow(()-> {
                    throw new IllegalStateException("Product does not exists");
                });

        temp.setIsAvailable(!temp.getIsAvailable());
        return repo.save(temp);
    }
    //-----Get product by collectionid
    public List<Product> getProductsByCollectionID(int collectionID) {
//        System.out.println(collectionID);
        return repo.findByCollectionID(collectionID);
    }
}
