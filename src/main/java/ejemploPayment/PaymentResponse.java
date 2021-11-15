package ejemploPayment;

public class PaymentResponse {

    enum PaymentStatus {
        OK, ERROR
    }

    // codigo de respuesta
    private PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
