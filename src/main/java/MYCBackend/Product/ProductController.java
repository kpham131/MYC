package MYCBackend.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;


    @GetMapping(path = "", produces = {"application/json"})
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping(path="/{id}", produces = {"application/json"})
    public Product getProductById(@PathVariable("id") Integer id){
        return service.getProductById(id);
    }

    @PostMapping(path = "", produces = {"application/json"})
    public Product createProduct(@RequestBody Product product){
        return service.createProduct(product);
    }

    @PutMapping(path = "/{id}", produces = {"application/json"})
    public Product updateProduct(@PathVariable("id") int id, @RequestBody Product product){
        System.out.println(product);
        return service.updateProduct(product);
    }

    @DeleteMapping(path = "/{id}", produces = {"application/json"})
    public void deleteProductById(@PathVariable("id") int id){
        service.deleteProductById(id);
    }

    @PutMapping(path = "/{id}/status", produces = {"application/json"})
    public Product changeProductStatus(@PathVariable("id") int id){
        return service.changeProductStatus(id);
    }




}
