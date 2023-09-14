package com.coelhospring.course.repositories;

import com.coelhospring.course.entities.Category;
import com.coelhospring.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
