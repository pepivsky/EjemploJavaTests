package ejemploPayment;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest paymentRequest);
}
