package ahmadirfaan.springdesignpatterncreational.singleton;

import lombok.Getter;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: Counter.java, v 0.1 2022‐03‐09 09.43 Ahmad Irfaan Hibatullah Exp $$
 */
public class Counter {

    @Getter
    private Long value = 0L;

    public synchronized void increment() {
        value++;
    }
}