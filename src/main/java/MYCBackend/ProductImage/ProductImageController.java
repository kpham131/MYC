package MYCBackend.ProductImage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/images")
public class ProductImageController {

    private final ProductImageService imageService;

    @Autowired
    public ProductImageController(ProductImageService imageService) {
        this.imageService = imageService;
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductImage> getAllImages() {
        return imageService.getAllImages();
    }

    @GetMapping(path = "/product/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductImage> getProductImagesByProductId(@PathVariable ("id") int productID) {
        System.out.println(productID);
        return imageService.getProductImagesByProductId(productID);
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductImage getImageByID(@PathVariable("id") int imageID) {
        System.out.println(imageID);
        return imageService.getImageByID(imageID);
    }

    @PostMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductImage createProductImage(@RequestBody ProductImage image) {
        System.out.println(image);
        return imageService.createProductImage(image);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ProductImage updateProductImage(@PathVariable("id") int imageID, @RequestBody ProductImage image) {
        System.out.println(imageID);
        System.out.println(image);
        return imageService.updateProductImage(imageID, image);
    }

    @DeleteMapping(path = "/{imageID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteProductImage(@PathVariable("imageID") int imageID) {
        return imageService.deleteProductImage(imageID);
    }
}
