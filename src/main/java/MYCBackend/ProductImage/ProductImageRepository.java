package MYCBackend.ProductImage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;

public interface ProductImageRepository extends JpaRepository <ProductImage, Integer> {

    @Query(" SELECT i FROM ProductImage i WHERE i.productID = ?1")
//    @Procedure(procedureName = "usp_ProductImages_getProductImages")
    ArrayList<ProductImage> getProductImages(int ProductID);
}
