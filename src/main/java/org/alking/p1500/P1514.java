package org.alking.p1500;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * TODO: dfs会超时
 */
public class P1514 {

    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {

        ArrayList<NodeProb>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>(1);
        }

        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            double prob = succProb[i];
            graph[x].add(new NodeProb(y, prob));
            graph[y].add(new NodeProb(x, prob));
        }

        double[] dp = new double[n];
        dp[start] = 1d;
        PriorityQueue<NodeProb> queue = new PriorityQueue<>(new Comparator<NodeProb>() {
            @Override
            public int compare(NodeProb o1, NodeProb o2) {
                return o2.prob > o1.prob ? 1 : -1;
            }
        });

        queue.add(new NodeProb(start, 1d));
        while (!queue.isEmpty()) {
            NodeProb p = queue.poll();

            int node = p.node;
            double prob = p.prob;

            for (NodeProb np : graph[node]) {
                int next = np.node;
                double nextProb = prob * np.prob;
                if(nextProb > dp[next]){
                    dp[next] = nextProb;
                    queue.add(new NodeProb(next,nextProb));
                }
            }

        }
        return dp[end];
    }

    static class NodeProb {
        public int node;
        public double prob;

        public NodeProb(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }


}
