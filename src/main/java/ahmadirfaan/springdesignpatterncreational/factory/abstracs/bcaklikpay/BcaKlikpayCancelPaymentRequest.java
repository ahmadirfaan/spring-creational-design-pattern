
package ahmadirfaan.springdesignpatterncreational.factory.abstracs.bcaklikpay;

import ahmadirfaan.springdesignpatterncreational.factory.abstracs.CancelPaymentRequest;
import ahmadirfaan.springdesignpatterncreational.factory.abstracs.PaymentMethod;
import lombok.Data;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: BcaKlikpayCancelPaymentRequest.java, v 0.1 2022‐03‐10 23.56 Ahmad Irfaan Hibatullah Exp $$
 */
@Data
public class BcaKlikpayCancelPaymentRequest implements CancelPaymentRequest {

    private String id;

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.BCA_KLIKPAY ;
    }
}