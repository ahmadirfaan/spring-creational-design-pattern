package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.bcaklikpay.BcaKlikpayCancelPaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.bcaklikpay.BcaKlikpayChargePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.bcaklikpay.BcaKlikpayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BcaKlikpayPaymentFactory.java, v 0.1 2022‐03‐11 00.05 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class BcaKlikpayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BcaKlikpayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BcaKlikpayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BcaKlikpayGetBalancePaymentRequest();
    }
}