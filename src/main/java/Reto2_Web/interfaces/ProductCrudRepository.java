package Reto2_Web.interfaces;


import Reto2_Web.modelo.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author USUARIO
 */
public interface ProductCrudRepository extends MongoRepository<Product, String> {
    
}
