package org.alking.p500;

import org.junit.Test;

public class P529Test {

    @Test
    public void test() {

        char[][] board = {
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'M', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'},
                {'E', 'E', 'E', 'E', 'E'}
        };
        char[][] board2 = new P529().updateBoard(board, new int[]{3, 0});
        //Assert.assertArrayEquals( new char[]{'B', '1', 'E', '1', 'B'},board2[0] );

    }
}
