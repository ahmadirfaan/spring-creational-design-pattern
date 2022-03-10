
package ahmadirfaan.springdesignpatterncreational.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: Product.java, v 0.1 2022‐03‐09 12.07 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
@Builder
public class Product {

    private String id;

    private String name;

    private String sku;

    private Long price;

    private Category category;


}