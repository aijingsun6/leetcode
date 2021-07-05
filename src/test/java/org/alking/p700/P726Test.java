package org.alking.p700;

import org.junit.Assert;
import org.junit.Test;

public class P726Test {

    @Test
    public void test(){

        P726 p726 = new P726();
        String formula = "H2O";
        String s = p726.countOfAtoms(formula);
        String expect = "H2O";
        Assert.assertEquals(expect,s);

        formula = "Mg(OH)2";
        s = p726.countOfAtoms(formula);
        expect = "H2MgO2";
        Assert.assertEquals(expect,s);

        formula = "Be32";
        s = p726.countOfAtoms(formula);
        expect = "Be32";
        Assert.assertEquals(expect,s);

        formula = "(NB3)33";
        s = p726.countOfAtoms(formula);
        expect = "B99N33";
        Assert.assertEquals(expect,s);
    }
}
