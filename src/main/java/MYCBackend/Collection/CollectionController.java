package MYCBackend.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/collections")
public class CollectionController {

    private final CollectionService collectionService;

    @Autowired
    public CollectionController (CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Collection> getCollections() {
        return collectionService.getAllCollections();
    }

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection getCollectionByID(@PathVariable("id") int id) {
        return collectionService.getCollectionByID(id);
    }

    @PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Collection createCollection(@RequestBody Collection collection) {
        System.out.println(collection);
        return collectionService.createCollection(collection);
    }

    @PutMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection updateCollection(@PathVariable("id") int collectionId, @RequestBody Collection collection) {
        return collectionService.updateCollection(collectionId, collection);
    }
    @DeleteMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCollection(@PathVariable("id") int collectionId) { collectionService.deleteCollection(collectionId);}

}
