package MYCBackend.Order;

import MYCBackend.OrderItem.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    // GET ALL ORDERS
    @GetMapping(path = "", produces = "application/json")
    public List<Order> getAllOrders(){
        return orderService.getAlLOrder();
    }

    // GET BY ID
    @GetMapping(path = "/{id}", produces = "application/json")
    public Order getOrderById(@PathVariable("id") UUID id){
        return orderService.getOrderById(id);
    }

    // GET ALL BY CUSTOMERID
    @GetMapping(path = "/{customerId}", produces = "application/json")
    public List<Order> getAllOrdersByCustomerId(@PathVariable("customerId") UUID customerId){
        return orderService.getAllOrdersByCustomerId(customerId);
    }


    // CREATE NEW ORDER
    @PostMapping(path="", produces = "application/json")
    public Order createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    // UPDATE ORDER
    @PutMapping(path = "/{id}", produces = "application/json")
    public Order updateOrder(@PathVariable("id") UUID id, @RequestBody Order order){
        return orderService.updateOrder(id, order);
    }

    // DELETE ORDER BY ID
    @DeleteMapping(path = "/{id}", produces = "application/json")
    public void deleteOrderById(@PathVariable("id") UUID id){
        orderService.deleteOrderById(id);
    }



}
