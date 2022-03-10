package ahmadirfaan.springdesignpatterncreational.factory.abstracs.dana;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.GetBalancePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.PaymentMethod;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: DanaGetBalancePaymentRequest.java, v 0.1 2022‐03‐10 23.57 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class DanaGetBalancePaymentRequest implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.DANA;
    }
}