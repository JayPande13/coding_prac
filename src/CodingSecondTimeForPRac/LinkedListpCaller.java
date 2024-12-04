package CodingSecondTimeForPRac;

public class LinkedListpCaller {

    public static void main(String[] args) {
        LinkedList ls= new LinkedList();
        ls = ls.add(1,ls);
        ls = ls.add(2,ls);
        ls = ls.add(3,ls);
        ls = ls.add(4,ls);
        ls = ls.add(5,ls);

        ls.print(ls);

//        ls=ls.delete(1,ls);
        ls = ls.edit(2,7,ls);
        ls.print(ls);
    }
}
