package org.alking.p400;

import java.util.Random;

public class P470 {

    public static class SolBase {
        public int rand7(){
            return new Random().nextInt(7);
        }
    }



    class Solution extends SolBase {
        
        public int rand10() {
            return rand7();
        }
    }

}
