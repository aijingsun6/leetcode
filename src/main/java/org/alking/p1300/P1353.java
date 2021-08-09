package org.alking.p1300;

import java.util.Arrays;
import java.util.Comparator;

public class P1353 {

    /**
     * TODO
     * @param events
     * @return
     */
    public int maxEvents(int[][] events) {

        Arrays.sort(events, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });

        int acc = 0;
        int[] range = null;
        for (int i = 0; i < events.length; i++) {
            int[] e = events[i];
            if (range == null) {
                // 参加第一个会议 [e[0],e[0]]
                range = e;
                acc += 1;
                continue;
            }


            //     | ------ |
            //     | ------ |


            // | ---- |
            //           |----|
            if (e[0] > range[1]){
                range = e;
                acc += 1;
                continue;
            }





        }

        return acc;
    }
}
