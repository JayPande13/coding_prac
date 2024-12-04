package Practice;

import java.util.Scanner;

public class EndOflIne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int index =0;
        while(input.hasNext()){
            System.out.println(++index + " " + input.nextLine());
        }
    }
}
