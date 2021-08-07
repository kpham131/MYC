package MYCBackend.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/collections")
public class CollectionController {

    private  final CollectionService collectionService;

    @Autowired
    public CollectionController (CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping
    public List<Collection> getCollections() {
        return null;
    }
}
