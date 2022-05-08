package org.alking.p900;

import org.junit.Assert;
import org.junit.Test;

public class P990Test {

    @Test
    public void test() {
        P990 p990 = new P990();
        String[] equations = new String[]{"a==b", "b==c", "a==c"};
        boolean result = p990.equationsPossible(equations);
        Assert.assertTrue(result);


        equations = new String[]{"c==c","b==d","x!=z"};
        result = p990.equationsPossible(equations);
        Assert.assertTrue(result);

        equations = new String[]{"a==b","b!=a"};
        result = p990.equationsPossible(equations);
        Assert.assertTrue(!result);
    }
}
