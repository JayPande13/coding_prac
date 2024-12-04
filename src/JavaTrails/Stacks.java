package JavaTrails;

import java.util.*;

public class Stacks {

    public static void main(String[] args) {
        hashMapImplementation();
    }

    public static void stackImplementation(){
        Stack st = new Stack();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(4);
        st.add(5);

        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.search(3));
        st.clear();
        System.out.println(st);
    }

    public static void hashSetImplementation(){

        HashSet hs = new HashSet(  );
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add("Jay");

        Iterator itr = hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next().hashCode());
        }

    }

    public static void hashMapImplementation(){
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(1,"AA");
        hm.put(2,"BB");
        hm.put(3,"CC");
        hm.put(4,"DD");

//        System.out.println(hm);

        Set set =  hm.entrySet();
//        System.out.println(set);

        Iterator itr = set.iterator();


        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry) itr.next();
//            System.out.println(entry.getKey());
        }

        for(Map.Entry me : hm.entrySet()){
            System.out.println(me.getKey());
        }




    }
}
