
package ahmadirfaan.springdesignpatterncreational.factory.abstracs.bcaklikpay;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.ChargePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.PaymentMethod;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BcaKlikpayChargePaymentRequest.java, v 0.1 2022‐03‐10 23.54 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class BcaKlikpayChargePaymentRequest implements ChargePaymentRequest {

    private String id;

    private Long amount;


    @Override
    public Long getFee() {
        return 5000L;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}