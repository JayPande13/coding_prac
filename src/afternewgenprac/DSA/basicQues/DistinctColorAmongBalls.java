package afternewgenprac.DSA.basicQues;

import java.util.*;

public class DistinctColorAmongBalls {
    public static int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Set<Integer>> ColorBall = new HashMap<>(); // color -> all unique balls
        Map<Integer,Integer> BallColor = new HashMap<>(); // ball -> last color it had.
        List<Integer> resultList = new ArrayList<>();
        int count = 0;

        for (int[] query : queries) {
           int currentBall = query[0];
           int currentColor = query[1];

           if(BallColor.containsKey(currentBall)){
               int lastColorOnThisBall = BallColor.get(currentBall);
               ColorBall.get(lastColorOnThisBall).remove(currentBall);
               if(ColorBall.get(lastColorOnThisBall).isEmpty()){
                   count--;
               }
           }

           BallColor.put(currentBall,currentColor);
           ColorBall.putIfAbsent(currentColor,new HashSet<>());
           ColorBall.get(currentColor).add(currentBall);
           if(ColorBall.get(currentColor).size() ==1){
               count++;
           }

            resultList.add(count);
        }


        int[] rarr = new int[resultList.size()];
        int index =0;
        for(int i : resultList){
            rarr[index++] =i;
        }
        return rarr;
    }

    public static void main(String[] args) {
        int[][] queries = new int[][]{{0,1},{0,4},{1,2},{1,5},{1,4}}; // LRU
//        int[][] queries = new int[][]{{1, 4}, {2, 5}, {1, 3}, {3, 4}};
        System.out.println(Arrays.toString(queryResults(4, queries)));
    }
}
