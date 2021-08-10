package MYCBackend.Collection;

import MYCBackend.Product.Product;
import MYCBackend.Product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/collections")
public class CollectionController {

    private final CollectionService collectionService;
    private final ProductService productService;
    @Autowired
    public CollectionController (CollectionService collectionService, ProductService productService) {
        this.collectionService = collectionService;
        this.productService = productService;
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Collection> getCollections() {
        return collectionService.getAllCollections();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection getCollectionByID(@PathVariable("id") int id) {
        return collectionService.getCollectionByID(id);
    }

    //---------GetProduct By collection id
    @GetMapping(path = "/{id}/products")
    public List<Product> getProductByCollectionID(@PathVariable("id") int collectionID) {
        return productService.getProductsByCollectionID(collectionID);
    }

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection createCollection(@RequestBody Collection collection) {
        System.out.println(collection);
        return collectionService.createCollection(collection);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection updateCollection(@PathVariable("id") int collectionId, @RequestBody Collection collection) {
        return collectionService.updateCollection(collectionId, collection);
    }
    @DeleteMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteCollection(@PathVariable("id") int collectionId) { return collectionService.deleteCollection(collectionId);}

}
