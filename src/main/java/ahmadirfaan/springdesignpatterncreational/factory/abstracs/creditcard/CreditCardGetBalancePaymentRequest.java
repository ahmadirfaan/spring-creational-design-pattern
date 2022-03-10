package ahmadirfaan.springdesignpatterncreational.factory.abstracs.creditcard;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.GetBalancePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.PaymentMethod;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CreditCardGetBalancePaymentRequest.java, v 0.1 2022‐03‐10 23.57 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    private String userId;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}