
package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.dana.DanaCancelPaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.dana.DanaChargePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.dana.DanaGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: DanaPaymentFactory.java, v 0.1 2022‐03‐11 00.07 Ahmad Irfaan Hibatullah Exp $$
 */

@Configuration
public class DanaPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new DanaChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new DanaCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new DanaGetBalancePaymentRequest();
    }
}