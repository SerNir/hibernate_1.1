import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ProductApp {
    public static void main(String[] args) {
SessionFactory sessionFactory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Product.class)
        .buildSessionFactory();

        ProductDao productDao = new ProductDao(sessionFactory);
        Product product = new Product("Apple", 150);
        productDao.addToProductList(product);

    }

}
