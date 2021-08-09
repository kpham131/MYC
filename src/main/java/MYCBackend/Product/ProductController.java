package MYCBackend.Product;

import MYCBackend.ProductImage.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;



@RestController
@RequestMapping("/products")
public class ProductController {

//    @Autowired
//    private ProductService service;
    private final ProductService service;

    @Autowired
    public ProductController(ProductService productService) {this.service = productService;}


    @GetMapping(path = "", produces = {"application/json"})
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping(path="/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Product getProductById(@PathVariable("id") Integer id)
    {
        Product pro= service.getProductById(id);
//        System.out.println(pro.);
        return service.getProductById(id);
    }

    @PostMapping(path = "", produces = {"application/json"})
    public Product createProduct(@RequestBody Product product){
        return service.createProduct(product);
    }

    @PutMapping(path = "/{id}", produces = {"application/json"})
    public Product updateProduct(@PathVariable("id") int id, @RequestBody Product product){
        return service.updateProduct(id, product);
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
