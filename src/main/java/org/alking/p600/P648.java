package org.alking.p600;

import java.util.List;

public class P648 {

    private static final int SIZE = 'z' - 'a' + 1;

    public static class MapNode {

        private boolean leaf = false;
        private String word;

        private MapNode[] map = new MapNode[SIZE];

        public MapNode() {

        }

        public void insertWord(String word) {
            if (word == null || word.isEmpty()) {
                return;
            }
            MapNode m = this;
            for (int i = 0; i < word.length(); i++) {
                int idx = word.charAt(i) - 'a';
                if (m.map[idx] == null) {
                    m.map[idx] = new MapNode();
                }
                m = m.map[idx];
            }
            m.leaf = true;
            m.word = word;
        }

        public String replace(String word) {
            MapNode m = this;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                int idx = c - 'a';
                m = m.map[idx];
                if (m == null) {
                    return word;
                }
                if (m.leaf) {
                    return m.word;
                }
            }
            return word;
        }
    }

    public String replaceWords(List<String> dictionary, String sentence) {
        MapNode mapNode = new MapNode();
        for (String w : dictionary) {
            mapNode.insertWord(w);
        }

        String[] array = sentence.split(" ");
        if(array.length < 1){
            return "";
        }
        StringBuilder result = new StringBuilder();
        result.append(mapNode.replace(array[0]));
        for(int i = 1; i < array.length;i++){
            result.append(" ");
            result.append(mapNode.replace(array[i]));
        }
        return result.toString();
    }


}
