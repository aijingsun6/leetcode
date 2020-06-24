package org.alking.queue;

import java.util.Deque;
import java.util.LinkedList;

public class NumSquares {

    public static class Node {
        int v;
        int depth;

        public Node(int v, int depth) {
            this.v = v;
            this.depth = depth;
        }
    }

    public int numSquares(int n) {

        Deque<Node> deque = new LinkedList<>();
        int[] vis = new int[n + 1];
        deque.addLast(new Node(n, 0));

        while (!deque.isEmpty()) {
            Node first = deque.removeFirst();
            if (first.v == 0) {
                return first.depth;
            }

            for (int i = 1;;i ++){
                int v = first.v - i * i;
                if(v < 0){
                    break;
                }
                if(v == 0){
                    return first.depth + 1;
                }
                if(vis[v] == 0){
                    vis[v] = 1;
                    deque.addLast(new Node(v,first.depth+1));
                }
            }

        }
        return 0;
    }
}
