package MYCBackend.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // GET ALL ORDERS
    public List<Order> getAlLOrder() {
        return orderRepository.findAll();
    }

    // GET ALL ORDER BY CUSTOMERID
    public List<Order> getAllOrdersByCustomerId(UUID customerId) {
        if(customerId==null){
            throw new IllegalStateException("This was a guest order");
        }
        return orderRepository.findAllByCustomerID(customerId);
    }

    // GET ORDER BY ID
    public Order getOrderById(UUID id) {
        return orderRepository.findById(id)
                .orElseThrow(()->{
                    throw new IllegalStateException("Order does not exist");
                });

    }

    // CREATE ORDER
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }


    // UPDATE ORDER
    public Order updateOrder(UUID id, Order order) {
        orderRepository.findById(id)
                .orElseThrow(()->{
                    throw new IllegalStateException("Order does not exist");
                });
        return orderRepository.save(order);
    }

    // DELETE ORDER BY ID
    public void deleteOrderById(UUID id) {
        orderRepository.findById(id)
                .orElseThrow(() -> {
                    throw new IllegalStateException("Order does not exist");
                });
        orderRepository.deleteById(id);
    }

    public List<Order> getOrderByStatus(int statusID) {
        return orderRepository.findAllByStatusID(statusID);
    }

    public List<Order> getOrderByCustomerIDAndStatus(UUID customerID, int statusID) {
        return orderRepository.findAllByCustomerIDAndStatusID(customerID, statusID);
    }

    public List<Order> getOrderByTimeRange(Timestamp fromDate, Timestamp toDate) {
        return orderRepository.getOrderByTimeRange(fromDate, toDate);
    }
}
