package nastya.ru.spring_docker;

import nastya.ru.spring_docker.entity.Product;
import nastya.ru.spring_docker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDockerApplication implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product(null, "name");

        productRepository.save(product);
        List<Product> all = productRepository.findAll();
        System.out.println(all);

    }
}
