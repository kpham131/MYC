package MYCBackend.OrderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orderItems")
public class OrderItemController {

    private final OrderItemService service;

    @Autowired
    public OrderItemController(OrderItemService service) {
        this.service = service;
    }

    @GetMapping(path="", produces = "application/json")
    public List<OrderItem> getAllOrderItems(){
        return service.getAllOrderItems();
    }

    @GetMapping(path="/{id}", produces = "application/json")
    public OrderItem getOrderItemById(@PathVariable("id") UUID id){
        return service.getOrderItemById(id);
    }


    @PostMapping(path = "", produces = "application/json")
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem){
        return service.createOrderItem(orderItem);
    }

    @PutMapping(path = "/{id}", produces = "application/json")
    public OrderItem updateOrderItem(@PathVariable("id") UUID id, @RequestBody OrderItem orderItem){
        return service.updateOrderItem(id, orderItem);
    }

    @DeleteMapping(path = "/{id}", produces = "application/json")
    public boolean deleteOrderItemById(@PathVariable("id") UUID id){
        return service.deleteOrderItemById(id);
    }


}
