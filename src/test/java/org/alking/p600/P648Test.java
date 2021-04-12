package org.alking.p600;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P648Test {

    @Test
    public void test(){
        P648 p648 = new P648();
        List<String> dictionary = Arrays.asList("cat","bat","rat");
        String sentence = "the cattle was rattled by the battery";
        String result = p648.replaceWords(dictionary,sentence);
        String expect = "the cat was rat by the bat";
        Assert.assertEquals(result,expect);

        dictionary = Arrays.asList("a","b","c");
        sentence = "aadsfasf absbs bbab cadsfafs";
        expect = "a a b c";
        result = p648.replaceWords(dictionary,sentence);
        Assert.assertEquals(result,expect);

    }
}
