
package ahmadirfaan.springdesignpatterncreational.prototype;

import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: Employee.java, v 0.1 2022‐03‐09 10.31 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class Employee {

    private String id;

    private String name;

    private Position position;

    private Long salary;


}