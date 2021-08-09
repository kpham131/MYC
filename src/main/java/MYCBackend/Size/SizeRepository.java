package MYCBackend.Size;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface SizeRepository extends JpaRepository<SizeInProduct, Integer> {
    Optional<SizeInProduct> findBySizeNameAndProductID(String sizeName, int productId);

}
