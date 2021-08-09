package MYCBackend.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {

//    @Query("SELECT o FROM Order o WHERE o.customerID = ?1")
    List<Order> findAllByCustomerID(UUID customerID);

    List<Order> findAllByStatusID(int statusID);

    List<Order> findAllByCustomerIDAndStatusID(UUID customerID, int statusID);

    //---GetOrderByDateRange
    @Query("SELECT o FROM Order o WHERE o.orderDate >= ?1 and o.orderDate <= ?2")
    List<Order> getOrderByTimeRange(Timestamp fromDate, Timestamp toDate);
}
