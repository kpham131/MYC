package MYCBackend.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollectionService {

     private final CollectionRepository collectionRepository;

     @Autowired
    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public List<Collection> getAllCollections() {
         return collectionRepository.findAll();
    }

    public Collection getCollectionByID(int collectionID) {
        return collectionRepository.findById(collectionID).get();
    }

//    public Collection updateCollection(Collection collection) {
//
//    }

}
