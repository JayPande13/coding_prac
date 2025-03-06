package afternewgenprac.LLD.FactoryDesign.FactoryRevision;

public class UPI implements Payment{
    @Override
    public void pay() {
        System.out.println("UPI payment");
    }
}
