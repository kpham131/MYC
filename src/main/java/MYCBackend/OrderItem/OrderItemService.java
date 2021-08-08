package MYCBackend.OrderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderItemService {

    private final OrderItemRepository repo;

    @Autowired
    public OrderItemService(OrderItemRepository repo) {
        this.repo = repo;
    }

    public List<OrderItem> getAllOrderItems() {
        return repo.findAll();
    }

    public OrderItem getOrderItemById(UUID id) {
        return repo.findById(id).get();
    }

    public OrderItem createOrderItem(OrderItem orderItem) {
        System.out.println("asasdad: "+ orderItem.getOrderID());
        return repo.save(orderItem);
    }

    public OrderItem updateOrderItem(OrderItem orderItem) {
        return repo.save(orderItem);
    }

    public void deleteOrderItemById(UUID id) {
        repo.deleteById(id);
    }


}
