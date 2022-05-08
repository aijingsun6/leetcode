package org.alking.p200;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class P212Test {

    @Test
    public void test(){
        char[][] board = new char[][]{
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };
        String[] words = new String[]{"oath","pea","eat","rain"};
        P212 p212 = new P212();
        List<String> result = p212.findWords(board,words);
        Assert.assertEquals(2,result.size());

        board = new char[][]{
                {'a','a'}
        };
        words = new String[]{"aaa"};
        result = p212.findWords(board,words);
        Assert.assertEquals(0,result.size());

    }
}
