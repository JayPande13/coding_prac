package DataStructure;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class HashMapImpl {
    public static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public  Node(K key,V value){
                this.key =key;
                this.value = value;
            }

        }
        private int n;
        private int N;
        private double k;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N =4;
            this.buckets =  new LinkedList[4];
            for(int i=0;i<N;i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        // Value will always be between 0-(N-1)
        private int hashingFunction(K key){ // Returns a Hashcode ( generated for all objects by JVM)
            int bi = key.hashCode(); // can return value from -x to +x , but we need only +
            return Math.abs(bi) % N; // Abstract method gives mod of number - And Remainder bcoz we need value lying between (0 to N-1). bcoz remiander cannot be greater than divisor
        }

        private int searchInLinkedIndex(K key,int bucketIndex){
            // Stored Ll -  All linked List Stored in a particular Index
            LinkedList<Node> storedLL= buckets[bucketIndex];
            for(int i=0;i< storedLL.size();i++){
                if(storedLL.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }

        private void reHashing(){
            // Store old data in a bucket
            LinkedList<Node> oldBucket[] =  buckets;
            // already incremented N size below, hence updating old Buckets Array with LinkedList Array of Size N
            buckets = new LinkedList[N];

            // Creating a Linked List in each index of updated buckets
            for(int i=0;i<N;i++){
                this.buckets[i] = new LinkedList<>();
            }

            // Looping in old array to for each Index
            for(int i=0;i<oldBucket.length;i++){
                // Storing all the Linked List Present in particular index in a Linked List
                LinkedList<Node> ll = oldBucket[i];
                // looping in all the linkedlist to get Each node
                for(int j= 0;i<ll.size();j++){
                    // Storing each node in object
                    Node node = ll.get(j);
                    // passing it to put function as to creating new Indexes using hashingFunction, getting new Index in New created Bucket and storing data
                    put(node.key,node.value);
                }
            }
        }


        public void put(K key, V value){
            int bi = hashingFunction(key);
            int di = searchInLinkedIndex(key,bi);

            //Key doesn't exist
            if(di ==-1){
                buckets[bi].add(new Node(key,value));
                n++;
            }else{
                Node alreadyPresentNode = buckets[bi].get(di);
                alreadyPresentNode.value = value;
            }
            k =2.0;
            double lambda = (double)n/N;
            if(lambda > k) {
                N = N *2;
                reHashing();
            }

        }

        public V get(K key){
            int bi = hashingFunction(key);
            int di = searchInLinkedIndex(key,bi);
            if(di ==-1) return null;
            else{
                Node foundNode = buckets[bi].get(di);
                return foundNode.value;
            }
        }

        public boolean containsKey(K key){
            int bi = hashingFunction(key);
            int di = searchInLinkedIndex(key,bi);
            return di != -1;
        }

        public V remove(K key){
            int bi = hashingFunction(key);
            int di = searchInLinkedIndex(key,bi);
            if(di ==-1) return null;
            else{
                Node foundNode = buckets[bi].remove(di);
                n--; // as we need to decrease size of node if a particular element in removed.
                return foundNode.value;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys= new ArrayList<>();
            for(int i=0;i<buckets.length;i++){ //bi
                LinkedList<Node> ll = buckets[i];
                for(int j =0; j<ll.size();j++){ //di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",190);
        hm.put("China",200);
        hm.put("US",100);
        hm.put("Nepal",10);

        ArrayList<String> keys  =hm.keySet();
        for (String key : keys) {
            System.out.println(key + " " + hm.get(key));
        }

        hm.remove("India");
        System.out.println(hm.get("India"));
    }
}
