package org.alking.p0;

import org.junit.Assert;
import org.junit.Test;

public class P79Test {

    @Test
    public void test() {
        P79 p79 = new P79();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        boolean exist = p79.exist(board,"ABCCED");
        Assert.assertTrue(exist);

        exist = p79.exist(board,"SEE");
        Assert.assertTrue(exist);

        exist = p79.exist(board,"ABCB");
        Assert.assertFalse(exist);


    }
}
