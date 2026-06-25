package org.example.vendaja.repositories;
import org.example.vendaja.entities.Category;
import org.example.vendaja.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
