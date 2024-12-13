package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ListFunction {
    static List mainList = new ArrayList();
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int noOfElements = input.nextInt();

        for(int i =0;i<noOfElements;i++){
            mainList.add(input.nextInt());
        }

        int noOfQueries = input.nextInt();

        for(int j=0;j< noOfQueries;j++){
            String action = input.next();
            if(Objects.equals(action, "Insert")){
                appendingList(input.nextInt(),input.nextInt());
            }else{
                int index = input.nextInt();
                shortenList(index);
            }
        }

        mainList.forEach((res)->{
            System.out.print(res + " ");
        });

    }
    public static void appendingList(int index,int number){
        mainList.add(index,number);
    }

    public static void shortenList(int index){
        mainList.remove(index);
    }
}
