
package ahmadirfaan.springdesignpatterncreational.factory.abstracs.creditcard;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.ChargePaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.PaymentMethod;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CreditCardChargePaymentRequest.java, v 0.1 2022‐03‐10 23.54 Ahmad Irfaan Hibatullah Exp $$
 */

@Data
public class CreditCardChargePaymentRequest implements ChargePaymentRequest {

    private String id;

    private Long amount;


    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}