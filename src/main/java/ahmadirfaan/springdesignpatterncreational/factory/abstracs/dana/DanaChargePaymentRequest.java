
package ahmadirfaan.springdesignpatterncreational.factory.abstracs.dana;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.ChargePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.PaymentMethod;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: DanaChargePaymentRequest.java, v 0.1 2022‐03‐10 23.54 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class DanaChargePaymentRequest implements ChargePaymentRequest {

    private String id;

    private Long amount;


    @Override
    public Long getFee() {
        return 1000L;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.DANA;
    }
}