package afternewgenprac;

public class Rectangle {
    int length;
    int breadth;

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
        RectangleModify(new Rectangle(R1));
//        System.out.println(R1.length);
    }
}



