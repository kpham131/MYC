package MYCBackend.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class SizeService {

    private final SizeRepository repo;

    @Autowired
    public SizeService(SizeRepository repo) {
        this.repo = repo;
    }

    public List<Size> getAllSize() {
        return repo.findAll();
    }

    public Size getSizeById(int id) {
        return repo.findById(id).get();
    }

    public Size createSize(Size size) {
        return repo.save(size);
    }

    public Size updateSize(Size size) {
        return repo.save(size);
    }

    public void deleteSize(int id) {
        repo.deleteById(id);
    }

    public Size updateQuantity(int sizeId, int newQuantity) {
        Size temp = repo.findById(sizeId).get();
        temp.setQuantity(newQuantity);
        return repo.save(temp);

    }
}
