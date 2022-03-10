package ahmadirfaan.springdesignpatterncreational.singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: SingletonApplication.java, v 0.1 2022‐03‐09 09.44 Ahmad Irfaan Hibatullah Exp $$
 */

@SpringBootApplication
public class SingletonApplication {

    @Bean
    public Counter counter() {
        return new Counter();
    }
}