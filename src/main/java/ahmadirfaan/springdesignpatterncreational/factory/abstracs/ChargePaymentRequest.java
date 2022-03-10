
package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: ChargePaymentRequest.java, v 0.1 2022‐03‐10 23.49 Ahmad Irfaan Hibatullah Exp $$
 */
public interface ChargePaymentRequest {

    String getId();

    void setId(String id);

    Long getAmount();

    void setAmount(Long amount);

    Long getFee();

    PaymentMethod getPaymentMethod();

}