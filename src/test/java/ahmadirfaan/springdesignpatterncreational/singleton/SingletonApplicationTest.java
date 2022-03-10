package ahmadirfaan.springdesignpatterncreational.singleton;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = SingletonApplication.class)
class SingletonApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testSingleton() {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);

        counter1.increment();
        counter2.increment();
        counter3.increment();

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());
    }

    // pengetesan pattern Singleton dengan kondisi Race Condition
    // dengan menambahkan synchronized untuk menghandle race condition pada pattern singleton
    @Test
    void testRaceCondition() throws InterruptedException {
        Counter counter1 = applicationContext.getBean(Counter.class);
        Counter counter2 = applicationContext.getBean(Counter.class);
        Counter counter3 = applicationContext.getBean(Counter.class);
        Counter counter4 = applicationContext.getBean(Counter.class);

        incrementCounterAsync(counter1, 1_000_000);
        incrementCounterAsync(counter2, 1_000_000);
        incrementCounterAsync(counter3, 1_000_000);
        incrementCounterAsync(counter4, 1_000_000);

        Thread.sleep(2_000L);

        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
        System.out.println(counter3.getValue());
        System.out.println(counter4.getValue());
    }

    private void incrementCounterAsync(Counter counter, int total) {
        new Thread(() -> {
            for(int i = 0; i < total; i++) {
                counter.increment();
            }
        }).start();
    }
}