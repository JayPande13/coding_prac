package afternewgenprac.LLD.FactoryDesign.FactoryRevision;

public class PaymentFactory {
    Payment getPaymentType(String type){
        if(type.equals("UPI")){
            return new UPI();
        }else if(type.equals("Credit")){
            return new CreditCard();
        } else{
            return null;
        }
    }
}
