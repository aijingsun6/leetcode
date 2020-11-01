package org.alking.p100;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P140 {

    public List<String> wordBreak(String s, List<String> wordDict) {
        res = new ArrayList<>();
        ArrayList<String> acc = new ArrayList<>();
        dfs(s,acc,wordDict);
        return res;

    }

    private List<String> res;

    private void dfs(String s, ArrayList<String> acc, List<String> wordDict) {
        if (s.equals("")) {
            res.add(String.join(" ", acc));
            return;
        }

        for(String w: wordDict){
            if(s.startsWith(w)){
                ArrayList<String> acc2 = new ArrayList<>(acc);
                acc2.add(w);
                String s2 = s.substring(w.length());
                dfs(s2,acc2,wordDict);
            }
        }

    }
}
