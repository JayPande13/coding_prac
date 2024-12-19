package CodingSecondTimeForPRac;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K,V> {

         class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        int n; // No of Nodes
         int N; // No of Buckets
         int k = 2 ;// comparison constant for ReHashing
        LinkedList<Node> [] bucket; // Array of LinkedList of Type Node is bucket.

        public HashMap(){
            this.N= 4;
            this.bucket =new LinkedList[N];
            for(int i=0;i<N;i++){
                this.bucket[i] = new LinkedList<>();
            }
        }

        int hashingFunction(K key){
            int index =  key.hashCode();
            return Math.abs(index) % N;
        }

        int searchInLinkedList(int bucketIndex, K key){
            LinkedList<Node> oneIndexLinkedList = bucket[bucketIndex];
            for(int i =0; i<oneIndexLinkedList.size();i++){
               if (oneIndexLinkedList.get(i).key == key) return i;
            }
            return -1;
        }

        void rehashing(){
            LinkedList<Node> [] oldData = bucket;
            bucket = new LinkedList[N];

            for(int i=0;i<N;i++){
                bucket[i] = new LinkedList<>();
            }

            for(int i=0;i<oldData.length;i++){
                 LinkedList<Node> currentIndexLL= oldData[i];

                 for(int j=0;j<currentIndexLL.size();j++){
                     K key = currentIndexLL.get(j).key;
                     V value = currentIndexLL.get(j).value;
                     put(key,value);

                 }
            }
        }

        public void put(K key, V value){
          int bucketIndex =   hashingFunction(key);
          int linkedListIndex =  searchInLinkedList(bucketIndex,key);
          if(linkedListIndex != -1){
              Node node= bucket[bucketIndex].get(linkedListIndex);
              node.value = value;
          }else{
              bucket[bucketIndex].add(new Node(key,value));
              n++;
          }
          double lambda = (double) n/N;
          if(lambda>2){
              N = N*2;
              rehashing();
          }
        }

        public V get(K key){
            int bucketIndex = hashingFunction(key);
            int linkedListIndex = searchInLinkedList(bucketIndex,key);
            if(linkedListIndex==-1){
                return null;
            }else{
                Node returningNode = bucket[bucketIndex].get(linkedListIndex);
                return  returningNode.value;
            }
        }

        public boolean containsKey(K key){
            int bucketIndex = hashingFunction(key);
            int linkedListIndex = searchInLinkedList(bucketIndex,key);
            return linkedListIndex != -1;
        }

        public V remove(K key){
            int bucketIndex = hashingFunction(key);
            int linkedListIndex = searchInLinkedList(bucketIndex,key);
            if(linkedListIndex==-1){
                System.out.println("Key Doesn't Exists");
                return null;
            }else{
                Node returningNode= bucket[bucketIndex].remove(linkedListIndex);
                return  returningNode.value;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<K>();
            for(int i =0; i<N;i++){
                LinkedList<Node> currentLL = bucket[i];
                for(int j=0;j<currentLL.size();j++){
                    Node currentNode = currentLL.get(j);
                    keys.add(currentNode.key);
                }
            }
            return keys;
        }

    }



