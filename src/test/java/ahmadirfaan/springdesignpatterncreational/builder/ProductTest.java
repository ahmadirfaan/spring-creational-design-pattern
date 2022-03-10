package ahmadirfaan.springdesignpatterncreational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testBuilder() {

        Product product = Product.builder()
                .id("A")
                .name("Apple Iphone")
                .price(13_000_000L)
                .category(Category.GADGET)
                .sku("APP").build();
        System.out.println(product);
        assertNotNull(product);
    }
}