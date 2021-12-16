package org.alking.p1600;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P1610Test {

    @Test
    public void test(){

        List<List<Integer>> points = Arrays.asList(
                Arrays.asList(2,1),
                Arrays.asList(2,2),
                Arrays.asList(2,3)
        );
        int angle = 90;
        List<Integer> location = Arrays.asList(1,1);
        P1610 p1610 = new P1610();
        int result = p1610.visiblePoints(points,angle,location);
        Assert.assertEquals(3,result);

        points = Arrays.asList(
                Arrays.asList(2,1),
                Arrays.asList(2,2),
                Arrays.asList(3,4),
                Arrays.asList(1,1)
        );
        location = Arrays.asList(1,1);
        result = p1610.visiblePoints(points,angle,location);
        Assert.assertEquals(4,result);

        points = Arrays.asList(
                Arrays.asList(1,0),
                Arrays.asList(2,1)
        );
        location = Arrays.asList(1,1);
        angle = 13;
        result = p1610.visiblePoints(points,angle,location);
        Assert.assertEquals(1,result);


        points = Arrays.asList(
                Arrays.asList(41,7),
                Arrays.asList(22,94),
                Arrays.asList(90,53),
                Arrays.asList(94,54),
                Arrays.asList(58,50),
                Arrays.asList(51,96),
                Arrays.asList(87,88),
                Arrays.asList(55,98),
                Arrays.asList(65,62),
                Arrays.asList(36,47),
                Arrays.asList(91,61),
                Arrays.asList(15,41),
                Arrays.asList(31,94),
                Arrays.asList(82,80),
                Arrays.asList(42,73),
                Arrays.asList(79,6),
                Arrays.asList(45,4)
        );
        location = Arrays.asList(6,84);
        angle = 17;
        result = p1610.visiblePoints(points,angle,location);
        Assert.assertEquals(5,result);


        points = Arrays.asList(
                Arrays.asList(45,26),
                Arrays.asList(82,12),
                Arrays.asList(33,83),
                Arrays.asList(58,50),
                Arrays.asList(55,92),
                Arrays.asList(66,42),
                Arrays.asList(25,74),
                Arrays.asList(74,74),
                Arrays.asList(36,87),
                Arrays.asList(7,41),
                Arrays.asList(89,36),
                Arrays.asList(44,22),
                Arrays.asList(84,9),
                Arrays.asList(96,90),
                Arrays.asList(75,51),
                Arrays.asList(87,15),
                Arrays.asList(50,75),
                Arrays.asList(90,84),
                Arrays.asList(56,18),
                Arrays.asList(43,48),
                Arrays.asList(23,27),
                Arrays.asList(100,34)
        );
        location = Arrays.asList(32,37);
        angle = 12;
        result = p1610.visiblePoints(points,angle,location);
        Assert.assertEquals(4,result);
    }
}
