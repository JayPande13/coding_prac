package afternewgenprac.LLD.FactoryDesign.FactoryRevision;

public class ClientPayment {
    public static void main(String[] args) {
        PaymentFactory pf = new PaymentFactory();
        Payment cr = (CreditCard) pf.getPaymentType("Credit");
        cr.pay();
    }
}
