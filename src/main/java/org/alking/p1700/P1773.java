package org.alking.p1700;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/count-items-matching-a-rule/
 */
public class P1773 {

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int idx = -1;
        if ("type".equals(ruleKey)) {
            idx = 0;
        } else if ("color".equals(ruleKey)) {
            idx = 1;
        } else if ("name".equals(ruleKey)) {
            idx = 2;
        }
        int acc = 0;
        for (List<String> e : items) {

            if (e.get(idx).equals(ruleValue)) {
                acc++;
            }
        }
        return acc;

    }
}
