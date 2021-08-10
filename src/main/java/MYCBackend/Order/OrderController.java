package MYCBackend.Order;

import MYCBackend.OrderItem.OrderItem;
import MYCBackend.OrderItem.OrderItemService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;
    private final OrderItemService orderItemService;

    @Autowired
    public OrderController(OrderService orderService, OrderItemService orderItemService) {
        this.orderService = orderService;
        this.orderItemService= orderItemService;
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
    @GetMapping(path = "/customer/{customerId}", produces = "application/json")
    public List<Order> getAllOrdersByCustomerId(@PathVariable("customerId") UUID customerId){
        return orderService.getAllOrdersByCustomerId(customerId);
    }
    //GET BY STATUS
    @GetMapping(path = "/status/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> getAllOrdersByStatus(@PathVariable("id") int statusID) {
        return orderService.getOrderByStatus(statusID);
    }

    //GET BY CUSID & STATUS
    @GetMapping(path = "/{customerID}/{statusID}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> getAllOrdersByCustomerIDAndStatus(@PathVariable("customerID") UUID customerID, @PathVariable(
            "statusID") int statusID) {
        return orderService.getOrderByCustomerIDAndStatus(customerID, statusID);
    }

    // GET BY TIME RANGE
    @GetMapping(path = "/{fromDate}/{toDate}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Order> getAllOrdersByTimeRange(@PathVariable("fromDate")Timestamp fromDate,
                                               @PathVariable("toDate") Timestamp toDate) {
        return orderService.getOrderByTimeRange(fromDate, toDate);
    }

    // GET ORDER ITEM
    @GetMapping(path = "/{orderID}/items", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderItem> getOrderItemsByOrderID(@PathVariable("orderID") UUID orderID) {
        return orderItemService.getAllOrderItemsByOrderID(orderID);
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
    public boolean deleteOrderById(@PathVariable("id") UUID id){
        return orderService.deleteOrderById(id);
    }



}
