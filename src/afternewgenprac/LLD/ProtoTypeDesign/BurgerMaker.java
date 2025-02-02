package afternewgenprac.LLD.ProtoTypeDesign;

// You can do it by implementing the PrototypeClone interface as well, in place of Cloneable
public class BurgerMaker implements Cloneable {

    int NumberOfPatty;
    int NumberOfBakedBuns;

    public BurgerMaker(int numberOfPatty, int numberOfBakedBuns){
        NumberOfPatty = numberOfPatty;
        NumberOfBakedBuns = numberOfBakedBuns;
    }

    public int getNumberOfPatty() {
        return NumberOfPatty;
    }

    public void setNumberOfPatty(int numberOfPatty) {
        NumberOfPatty = numberOfPatty;
    }

    public int getNumberOfBakedBuns() throws InterruptedException {
        Thread.sleep(5000);
        return NumberOfBakedBuns;
    }

    public void setNumberOfBakedBuns(int numberOfBakedBuns){
        NumberOfBakedBuns = numberOfBakedBuns;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object o = super.clone();
        return new BurgerMaker(this.NumberOfPatty,this.NumberOfBakedBuns);
    }

    @Override
    public String toString() {
        return this.NumberOfPatty + " with " + this.NumberOfBakedBuns + " baked buns, is Ready!!!";
    }
}
