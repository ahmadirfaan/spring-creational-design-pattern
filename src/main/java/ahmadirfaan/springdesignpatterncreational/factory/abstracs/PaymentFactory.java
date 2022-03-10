
package ahmadirfaan.springdesignpatterncreational.factory.abstracs;

/**
 * @author Ahmad Irfaan Hibatullah
 * @version $Id: PaymentFactory.java, v 0.1 2022‐03‐10 23.53 Ahmad Irfaan Hibatullah Exp $$
 */
public interface PaymentFactory {

    ChargePaymentRequest createChargeRequest();

    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();
}