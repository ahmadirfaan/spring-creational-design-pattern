
package ahmadirfaan.springdesignpatterncreational.builder;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BuilderApplication.java, v 0.1 2022‐03‐09 12.34 Ahmad Irfaan Hibatullah Exp $$
 */

@SpringBootApplication
public class BuilderApplication {

    @Bean
    @Scope("prototype")
    public Product productGadget() {
        return Product.builder()
                .category(Category.GADGET)
                .build();
    }

    @Bean
    @Scope("prototype")
    public Product productFashion() {
        return Product.builder()
                .category(Category.FASHION)
                .build();
    }
}