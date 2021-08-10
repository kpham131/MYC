package MYCBackend.ProductImage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductImageRepository extends JpaRepository <ProductImage, Integer> {


    @Query(value = "EXEC usp_ProductImages_getProductImages :product_id", nativeQuery = true)
//    @Query(" SELECT i FROM ProductImage i WHERE i.productID = ?1")
//    @Procedure
    List<ProductImage> getProductImages(@Param("product_id") Integer ProductID);

    Optional<ProductImage> findByImageURLAndProductID(String url, int productId);
}
