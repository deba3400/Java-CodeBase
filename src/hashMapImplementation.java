import java.util.*;
public class hashMapImplementation {
    // HashMap
    public static class HashMap<K,V>{
        private class Node{
            K key;
            V value;
            public Node(K key, V value){
                this.key=key;
                this.value=value;

            }
        }
        private int n;// this is number of node
        private int N;// number of Array buckets
        private LinkedList<Node> buckets[];// create a array which store linkedlist<node> type data
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<N;i++){
                this.buckets[i]=new LinkedList<>();
            }

        }
        private int hashFunction(K key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;
        }
        public int searchInLL(K key){
            int bi=hashFunction(key);
            LinkedList<Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
                 return -1;
        }
        // put Function
        public void put(K key, V value){
            int bi=hashFunction(key);// find out the bucket index
            int di=searchInLL(key);// search in linkedlist

            if(di==-1){// key is not present in the linkedlist
                this.buckets[bi].add(new Node(key ,value));
                n++;
            }
            else{

               Node node= buckets[bi].get(di);
               node.value=value;

            }
            double lambdaFactor=(double)n/N;
            if(lambdaFactor> 0.75){
//                rehash();
            }

        }

        // get operation
        public void get(K key){

        }
        //Containskey function

        public boolean containsKey(K key){
            return false;
        }

        //remove function

        public void remove(K key){

        }

        // size function

        public int size(){
            return 0;
        }

        public ArrayList<K> keySet(){
         return null;

        }




    }





    // main function
    public static void main(String[] args) {
        HashMap<String, Integer> map =new HashMap<>();
        map.put("mango",40);
        System.out.println(map);
    }
}
