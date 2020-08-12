package org.alking.graph;

import java.util.*;

public class CloneGraph {

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        HashMap<Integer,Node> cache = new HashMap<>();
        return cloneGraph(node, cache);
    }

    public Node cloneGraph(Node node,HashMap<Integer,Node> cache) {
        int val = node.val;
        Node clone;
        if(cache.containsKey(val)){
            clone = cache.get(val);
        }else {
            clone = new Node(val);
            cache.put(val,clone);
            for(Node want: node.neighbors){
                Node create = cloneGraph(want,cache);
                clone.neighbors.add(create);
            }

        }
        return clone;
    }
}
