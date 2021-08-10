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
//        return repo.findById(id)
//                .orElseThrow( () -> {
//            throw new IllegalStateException("OrderItem doest not exist");
//        });
        return repo.findById(id).get();
    }

    public List<OrderItem> getAllOrderItemsByOrderID(UUID orderID) {return repo.findAllByOrderID(orderID);}

    public OrderItem createOrderItem(OrderItem orderItem) {
        repo.findByOrderIDAndSizeInProductID(orderItem.getOrderID(), orderItem.getSizeInProductID())
                .ifPresent(param->{
                    throw new IllegalStateException("OrderItem already exists");
                });
        return repo.save(orderItem);
    }

    public OrderItem updateOrderItem(UUID id, OrderItem orderItem) {
        repo.findById(id)
                .orElseThrow(()->{
                    throw new IllegalStateException("OrderItem does not exist");
                });
        return repo.save(orderItem);
    }

    public boolean deleteOrderItemById(UUID id) {
//        repo.findById(id)
//                .orElseThrow(()->{
//                    throw new IllegalStateException("OrderItem does not exist");
//                });
        try{
            repo.deleteById(id);
        }
        catch (Exception e){
            return false;
        }
        return true;

    }


}
