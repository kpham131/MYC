package MYCBackend.ProductImage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductImageService {
    private final ProductImageRepository repository;

    @Autowired
    public ProductImageService(ProductImageRepository repository) {
        this.repository = repository;
    }


    public List<ProductImage> getAllImages() {
        return repository.findAll();
    }
    //--------Get product images
    public List<ProductImage> getProductImages(int productID) {
        return repository.getProductImages(productID);
    }

    //-------Get  image by ID
    public ProductImage getImageByID(int imageID) {
        return repository.findById(imageID).get();
    }

    //------Add product images
    public ProductImage createProductImage(ProductImage image) {
        repository.findByImageURLAndProductID(image.getImageURL(), image.getProductID())
                .ifPresent(param->{
                    throw new IllegalStateException("image already exist");
                });
        return repository.save(image);
    }

    //------Update product image
    @Transactional
    public ProductImage updateProductImage(int imageID, ProductImage image) {
        System.out.println(image.getImageID());
        ProductImage imageByID = repository.findById(imageID)
                .orElseThrow(() -> new IllegalStateException(
                        "image with id: " + imageID +" does not exist!"
                ));
        if(!repository.existsById(imageID)){
            throw new IllegalStateException("Image with "+ imageID+" does not exist");
        }
        return repository.save(image);
    }

    //-------Delete product image
    public boolean  deleteProductImage(int imageID) {
        try{
            repository.deleteById(imageID);
        }catch (Exception e){
            return false;
        }
        return true;
    }


}
