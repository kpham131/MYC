package MYCBackend.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Integer> {

    @Query("SELECT c FROM Collection c WHERE c.collectionName= ?1")
    Optional<Collection> findCollectionByCollectionName(String name);
}
