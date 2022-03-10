package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: GetBalancePaymentRequest.java, v 0.1 2022‐03‐10 23.52 Ahmad Irfaan Hibatullah Exp $$
 */
public interface GetBalancePaymentRequest {

    String getUserId();

    void setUserId(String userId);

    PaymentMethod getPaymentMethod();

}