package afternewgenprac.LLD.ProtoTypeDesign;

public class Guest  {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        BurgerMaker bm = new BurgerMaker(2,2);
        bm.getNumberOfBakedBuns(); // getting the burger.
        System.out.println(bm);

        BurgerMaker nbm = (BurgerMaker) bm.clone();
        nbm.setNumberOfPatty(3);
        System.out.println(nbm);

    }

}
