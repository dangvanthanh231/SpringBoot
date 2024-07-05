package com.example.Admin.repository;


import com.example.Admin.model.Order;
import com.example.Admin.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    @Query(value = "select o from Order o where o.customer.id = ?1")
    List<Order> findAllByCustomerId(Long id);
}
