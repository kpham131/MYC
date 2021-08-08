package MYCBackend.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

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

    //----Khong cho ten collection giong nhau
    public Collection createCollection(Collection collection) {
        Optional<Collection> collectionByName =
                collectionRepository.findCollectionByCollectionName(collection.getCollectionName());
        System.out.println(collectionByName);
        if (collectionByName.isPresent()) {
            throw new IllegalStateException("Collection exists");
        }
        System.out.println(collectionByName);
         return collectionRepository.save(collection);
     }

     @Transactional
    public Collection updateCollection(int collectionId,Collection collection) {
         System.out.println(collection.getCollectionID());
        Collection collectionByID = collectionRepository.findById(collectionId)
                .orElseThrow(() -> new IllegalStateException(
                        "collection with id:" + collectionId + "does not exist"
                ));
         System.out.println(collection);
         System.out.println(collectionByID);
        return collectionRepository.save(collection);
    }

    public void deleteCollection (int collectionID) {
         boolean exist = collectionRepository.findById(collectionID).isPresent();
         if (!exist) {
             throw new IllegalStateException("Collection id: " + collectionID + "does not exist!");
         }
         collectionRepository.deleteById(collectionID);
     }
}
