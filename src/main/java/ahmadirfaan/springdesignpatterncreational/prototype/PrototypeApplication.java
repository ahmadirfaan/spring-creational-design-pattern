package ahmadirfaan.springdesignpatterncreational.prototype;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: PrototypeApplication.java, v 0.1 2022‐03‐09 10.34 Ahmad Irfaan Hibatullah Exp $$
 */

@SpringBootApplication
public class PrototypeApplication {

    @Bean
    @Scope("prototype")
    public Employee employeeStaff() {
        Employee employee = new Employee();
        employee.setPosition(Position.STAFF);
        employee.setSalary(10_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeManager() {
        Employee employee = new Employee();
        employee.setPosition(Position.MANAGER);
        employee.setSalary(20_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeVicePresident() {
        Employee employee = new Employee();
        employee.setPosition(Position.VICE_PRESIDENT);
        employee.setSalary(30_000_000L);
        return employee;
    }

    @Bean
    @Scope("prototype")
    public Employee employeeCLevel() {
        Employee employee = new Employee();
        employee.setPosition(Position.C_LEVEL);
        employee.setSalary(40_000_000L);
        return employee;
    }


}