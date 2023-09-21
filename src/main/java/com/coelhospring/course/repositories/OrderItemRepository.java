package com.coelhospring.course.repositories;

import com.coelhospring.course.entities.OrderItem;
import com.coelhospring.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {


}
