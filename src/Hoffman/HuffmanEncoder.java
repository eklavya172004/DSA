package Hoffman;

import Heap.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HuffmanEncoder {
    HashMap<Character,String> encode;
    HashMap<String,Character> decoder;

    private class Node implements Comparable<Node>{
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data,int cost){
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

        //huffman heap making

        public  HuffmanEncoder(String feeder) throws Exception{

            HashMap<Character,Integer> fmap = new HashMap<>();

            //for loop to put every character into the hashmap
            for (int i = 0; i < feeder.length(); i++) {
                char ch = feeder.charAt(i);
                fmap.put(ch, fmap.getOrDefault(ch, 0) + 1);
            }

            //will get the fre value thorugh get means will map.get(key) and inert that thig into the min heap
            Heap<Node> minHeap = new Heap<Node>();



            Set<Map.Entry<Character,Integer>> entrySet = fmap.entrySet();

            for (Map.Entry<Character,Integer> entry:entrySet) { 
                Node node = new Node(entry.getKey(),entry.getValue());
                minHeap.insert(node);
            }

            while (minHeap.size() > 1) {
                    Node first = minHeap.remove();
                    Node second = minHeap.remove();

                    Node newNode  = new Node('/',first.cost+second.cost);
                    newNode.left = first;
                    newNode.right = second;

                minHeap.insert(newNode);
            }

            Node ft = minHeap.remove();

            this.encode = new HashMap<>();
            this.decoder = new HashMap<>();

            this.initEncodeDecoder(ft,"");
        }

    private void initEncodeDecoder(Node node, String osf) {
        if (node == null){
            return;
        }

        if (node.left == null && node.right == null){
            this.encode.put(node.data,osf);
            this.decoder.put(osf,node.data);
        }

        initEncodeDecoder(node.left,osf+"0");
        initEncodeDecoder(node.right,osf+"1");
    }


    public String encode(String source){
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            ans.append(encode.get(source.charAt(i)));
        }

        return ans.toString();
    }

    public String decode(String codeString){

        StringBuilder key = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < codeString.length(); i++) {
            key.append(codeString.charAt(i));
            if (decoder.containsKey(key.toString())) {
                ans.append(decoder.get(key.toString()));
                key.setLength(0); // reset key
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) throws Exception {
        String text = "abbccda";
        HuffmanEncoder he = new HuffmanEncoder(text);

        String encoded = he.encode(text);
        System.out.println("Encoded: " + encoded + " " +encoded.length());

        String decoded = he.decode(encoded);
        System.out.println("Decoded: " + decoded+" "+decoded.length());
    }
}

