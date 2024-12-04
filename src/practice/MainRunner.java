package Practice;

import java.util.*;

public class MainRunner {
    static Map<Integer,List> outputMap = new HashMap<>();
    public static void mainFunction(int a,int b,int n,int index){
        List outputList = new ArrayList();
        int result = (a + 1 * b);

        outputList.add(result);
        for(int i=1;i<n;i++) {
            result=  result + ((int)Math.pow(2,i) *b);
           outputList.add(result);
        }
        outputMap.put(index,outputList);
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int a =1;
        int b =1;
        int n =1;
        for(int i=0;i<t;i++){
            a = in.nextInt();
            b = in.nextInt();
            n = in.nextInt();
            mainFunction(a, b, n,i);
        }
        in.close();
        for (Map.Entry<Integer, List> entry : outputMap.entrySet()){
            entry.getValue().forEach((element)->{
                System.out.print(element + " ");
            });
            System.out.println("");
        }
    }

}
