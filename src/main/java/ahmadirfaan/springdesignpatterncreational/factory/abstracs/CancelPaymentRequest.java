package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: CancelPaymentRequest.java, v 0.1 2022‐03‐10 23.50 Ahmad Irfaan Hibatullah Exp $$
 */
public interface CancelPaymentRequest {

    String getId();

    void setId(String id);

    PaymentMethod getPaymentMethod();

}