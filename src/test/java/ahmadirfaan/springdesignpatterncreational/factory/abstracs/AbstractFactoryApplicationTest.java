package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAbstractFactory() {

        PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory paymentFactoryBcaKlikPay = applicationContext.getBean(BcaKlikpayPaymentFactory.class);
        PaymentFactory paymentFactoryDana = applicationContext.getBean(DanaPaymentFactory.class);

        charge(paymentFactoryCreditCard);
        charge(paymentFactoryDana);
        charge(paymentFactoryBcaKlikPay);
    }

    void charge(PaymentFactory paymentFactory) {
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("xxx");
        request.setAmount(1000000L);

        //kirim ke payment gateway
        System.out.println(request);
    }

    private void cancel(PaymentFactory paymentFactory) {
        CancelPaymentRequest request = paymentFactory.createCancelRequest();
        request.setId("xxx");

        System.out.println(request);
    }

    private Long getBalance(PaymentFactory paymentFactory) {
        try {
            GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
            request.setUserId("xxx");

            //send to paymentGateway
            System.out.println(request);
            return 1000L;
        } catch (UnsupportedOperationException e) {
            return 0L;
        }
    }
}