package afternewgenprac.LLD.FactoryDesign.FactoryRevision;

public class CreditCard implements Payment{
    @Override
    public void pay() {
        System.out.println("Credit Card Pay");
    }
}
