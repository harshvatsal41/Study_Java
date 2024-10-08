package com.start.HashMap;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Impl {
    static class HashMap<K,V>{
        public class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for (int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hasFunction(K key){
            int bi = key.hashCode(); //0 to N-1
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key,int bi){
            LinkedList<Node> ll =  buckets[bi];
            for(int i = 0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] =buckets;
            buckets = new LinkedList[N*2];
            for (int i =0;i<oldBucket.length;i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }
        public void put(K key,V value){
            int bi = hasFunction(key);//Bucket Index
            int di = searchInLL(key,bi);//Data index Index = (0+)Valid , (-1)Invalid
            if(di==-1){
                buckets[bi].add(new Node(key, value));
                System.out.println("Value Added");
                n++;
            }else{
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda>2){
                rehash();
            }
        }
        public V get(K key){
            int bi = hasFunction(key);//Bucket Index
            int di = searchInLL(key,bi);//Data index Index = (0+)Valid , (-1)Invalid
            if(di==-1){
                return null;
            }else{
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        public boolean containsKey(K key){
            int bi = hasFunction(key);//Bucket Index
            int di = searchInLL(key,bi);//Data index Index = (0+)Valid , (-1)Invalid
            if(di==-1){
                return false;
            }else{
                Node node = buckets[bi].get(di);
                return true;
            }
        }
        public V remove(K key){
            int bi = hasFunction(key);//Bucket Index
            int di = searchInLL(key,bi);//Data index Index = (0+)Valid , (-1)Invalid
            if(di==-1){
                return null;
            }else{
                Node node = buckets[bi].remove();
                System.out.println("Value Removed");
                n--;
                return node.value;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0;i< buckets.length;i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }


    }

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(6001, "Pratham");
        map.remove(6001);
    }
}
