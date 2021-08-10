package MYCBackend.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
//    @Query("SELECT p FROM Product p WHERE p.collectionID = ?1")
//    @Procedure(procedureName = "usp_Products_getByCollectionID")
    ArrayList<Product> findByCollectionID(int CollectionID);
    Optional<Product> findByProductNameAndCollectionID(String productName, int collectionID);
}
