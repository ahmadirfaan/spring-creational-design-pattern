package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.creditcard.CreditCardCancelPaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.creditcard.CreditCardChargePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CreditCardPaymentFactory.java, v 0.1 2022‐03‐11 00.05 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
//        throw new UnsupportedOperationException("Get Balance is not supported in Credit Card");
        return new CreditCardGetBalancePaymentRequest();
    }
}