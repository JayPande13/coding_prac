package afternewgenprac;

public class Rectangle {
    int length;
    int breadth;


    // Overriding equals and hashcode method.
    @Override
    public boolean equals(Object obj) {
        if(obj == this) return  true;
        if(obj== null||obj.getClass() != this.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return rectangle.length == this.length && rectangle.breadth == this.breadth;
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 2);
    }

    public Rectangle() {}

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }



    public  static void RectangleModify(Rectangle R2) {
        R2.length = 50;
        System.out.println(R2.length);
//        int i = 10;
//        modifyInt(i);
//        System.out.println(i);

    }

    public static void modifyInt(int data){
        data= 40;
        System.out.println(data);
    }

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.length=10;
        RectangleModify(R1);
//        System.out.println(R1.length);
    }
}



