package org.alking.p800;

public class P880 {

    private static class PrintNode {

        String str;
        int multi;
        PrintNode pre = null;

        private int sizeCache = -1;

        public int size() {
            if (sizeCache > -1) {
                return sizeCache;
            }
            int tmp;
            if (pre == null) {
                tmp = str.length();
            } else {
                tmp = pre.size() + str.length();
            }
            tmp = tmp * multi;
            this.sizeCache = tmp;
            return tmp;
        }

        public char charAt(int idx) {
            if(pre == null){
                int idx2 = idx % str.length();
                return str.charAt(idx2);
            }
            int t =  str.length() + pre.size();
            int idx2 = idx % t;
            if (idx2 < pre.size()) {
                return pre.charAt(idx2);
            }
            return str.charAt(idx2 - pre.size());
        }

        public PrintNode(String s) {
            this.str = s;
        }
    }

    public String decodeAtIndex(String s, int k) {
        PrintNode root = null;
        int idx = 0;
        int N = s.length();
        while (idx < N) {
            // find str
            while (idx < N && !Character.isLetter(s.charAt(idx))) {
                idx++;
            }
            int start = idx;

            while (idx < N && Character.isLetter(s.charAt(idx))) {
                idx++;
            }
            int end = idx;
            String str = s.substring(start, end);

            int multi = 1;

            while (idx < N && Character.isDigit(s.charAt(idx))) {
                multi = multi * (s.charAt(idx) - '0');
                idx++;
            }
            PrintNode node = new PrintNode(str);
            node.pre = root;
            node.multi = multi;
            root = node;
            int size = root.size();
            if (size >= k) {
                break;
            }
        }
        return String.valueOf(root.charAt(k-1));
    }
}
