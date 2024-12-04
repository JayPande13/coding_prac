package Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class ContactBook {
    static HashMap<String,Integer> contactBook = new HashMap();
    public static void main(String[] args) {
        {
            LinkedList<String> ls = new LinkedList<>();
            Scanner in = new Scanner(System.in);
            int n=in.nextInt();
             in.nextLine();
            for(int i=0;i<n;i++)
            {
                String name=in.nextLine();
                int phone=in.nextInt();
                contactBook.put(name, phone);
                 in.nextLine();
            }
            while(in.hasNext())
            {
                String s=in.nextLine();
                Integer contactFound = findContact(s);
                if(Objects.nonNull(contactFound)){
                    System.out.println(s + "=" + contactFound);
                }else{
                    System.out.println("Not Found");
                }
            }
        }
    }

    public static Integer findContact(String name){
        Integer foundContact = contactBook.get(name);
        if(Objects.nonNull(foundContact)) return foundContact;
        else return null;
    }
}
