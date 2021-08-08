package MYCBackend.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sizes")
public class SizeController {

    @Autowired
    private SizeService service;

    @GetMapping(path = "", produces = {"application/json"})
    public List<Size> getAllSizes(){
        return service.getAllSize();
    }

    @GetMapping(path="/{id}", produces = {"application/json"})
    public Size getSizeById(@PathVariable("id") int id){
        return service.getSizeById(id);
    }

    @PostMapping(path = "", produces = {"application/json"})
    public Size createSize(@RequestBody Size size){
        return service.createSize(size);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public Size updateSize(@RequestBody Size size){
        return service.updateSize(size);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public void deleteSize(@PathVariable("id") int id){
        service.deleteSize(id);
    }

    @PutMapping(path="/{sizeId}/{productId}", produces = "application/json")
    public Size updateQuantity(@PathVariable("sizeId") int sizeId, @PathVariable("productId") int productId, @RequestHeader("newQuantity") int newQuantity){
        return service.updateQuantity(sizeId, newQuantity);
    }
}
