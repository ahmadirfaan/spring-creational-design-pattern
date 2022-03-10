package ahmadirfaan.springdesignpatterncreational.factory.abstracs.bcaklikpay;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.GetBalancePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.PaymentMethod;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BcaKlikpayGetBalancePaymentRequest.java, v 0.1 2022‐03‐10 23.57 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class BcaKlikpayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}