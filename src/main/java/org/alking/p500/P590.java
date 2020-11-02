package org.alking.p500;

import java.util.ArrayList;
import java.util.List;

public class P590 {

    public static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<Integer> postorder(Node root) {
        res = new ArrayList<>();
        dfs(root);
        return res;
    }

    private List<Integer> res;

    private void dfs(Node root){
        if(root == null){
            return;
        }
        List<Node> children = root.children;
        if(children != null && !children.isEmpty()){
            for(Node c: children){
                dfs(c);
            }
        }
        res.add(root.val);

    }
}
