package MYCBackend.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Integer> {

    Optional<Collection> findByCollectionName(String name);

    //------Done with query(stored proc)
    @Query(value = "EXEC usp_Collections_getCollections;", nativeQuery = true)
//    @Procedure (name = "usp_Collections_getCollections")
    List<Collection> getCollections();


}
