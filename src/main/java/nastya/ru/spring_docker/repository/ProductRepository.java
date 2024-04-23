package nastya.ru.spring_docker.repository;

import nastya.ru.spring_docker.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product, Long> {
}