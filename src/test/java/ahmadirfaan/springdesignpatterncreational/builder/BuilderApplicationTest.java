package ahmadirfaan.springdesignpatterncreational.builder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest(classes = BuilderApplication.class)
class BuilderApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testBuilderPrototype() {

        Product productGadget = applicationContext.getBean("productGadget", Product.class);
        productGadget.setName("Laptop 15 Inch");

        Product productFashion = applicationContext.getBean("productFashion", Product.class);
        productFashion.setName("Celana Erigo");

        System.out.println(productGadget);
        System.out.println(productFashion);
    }
}