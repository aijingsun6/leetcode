package org.alking.p300;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class P332Test {

    @Test
    public void test() {

        List<List<String>> tickets = Arrays.asList(
                Arrays.asList("MUC", "LHR"),
                Arrays.asList("JFK", "MUC"),
                Arrays.asList("SFO", "SJC"),
                Arrays.asList("LHR", "SFO")
        );
        P332 p332 = new P332();
        List<String> result = p332.findItinerary(tickets);
        Assert.assertEquals(5, result.size());
        Assert.assertEquals("JFK", result.get(0));
        Assert.assertEquals("MUC", result.get(1));
        Assert.assertEquals("LHR", result.get(2));
        Assert.assertEquals("SFO", result.get(3));
        Assert.assertEquals("SJC", result.get(4));
    }

    @Test
    public void test2() {
        // [["JFK","SFO"],["JFK","ATL"],["SFO","ATL"],["ATL","JFK"],["ATL","SFO"]]
        // ["JFK","ATL","JFK","SFO","ATL","SFO"]
        List<List<String>> tickets = Arrays.asList(
                Arrays.asList("JFK", "SFO"),
                Arrays.asList("JFK", "ATL"),
                Arrays.asList("SFO", "ATL"),
                Arrays.asList("ATL", "JFK"),
                Arrays.asList("ATL", "SFO")
        );
        P332 p332 = new P332();
        List<String> result = p332.findItinerary(tickets);
        Assert.assertEquals(6, result.size());
        Assert.assertEquals("JFK", result.get(0));
        Assert.assertEquals("ATL", result.get(1));
        Assert.assertEquals("JFK", result.get(2));
        Assert.assertEquals("SFO", result.get(3));
        Assert.assertEquals("ATL", result.get(4));
        Assert.assertEquals("SFO", result.get(5));
    }

    @Test
    public void test3() {
        // [["JFK","KUL"],["JFK","NRT"],["NRT","JFK"]]
        List<List<String>> tickets = Arrays.asList(
                Arrays.asList("JFK","KUL"),
                Arrays.asList("JFK","NRT"),
                Arrays.asList("NRT","JFK")
        );
        P332 p332 = new P332();
        List<String> result = p332.findItinerary(tickets);
        Assert.assertEquals(4, result.size());
    }
    @Test
    public void test4(){
        // [["EZE","AXA"],
        // ["TIA","ANU"],
        // ["ANU","JFK"],
        // ["JFK","ANU"],
        // ["ANU","EZE"],
        // ["TIA","ANU"],
        // ["AXA","TIA"],
        // ["TIA","JFK"],
        // ["ANU","TIA"],
        // ["JFK","TIA"]]
        // ["JFK","ANU","EZE","AXA","TIA","ANU","JFK","TIA","ANU","TIA","JFK"]

        // [["EZE","AXA"],

        // ["ANU","JFK"],
        // ["ANU","TIA"],
        // ["ANU","EZE"],

        // ["JFK","TIA"]]
        // ["JFK","ANU"],


        // ["TIA","ANU"],
        // ["TIA","ANU"],
        // ["TIA","JFK"],

        // ["AXA","TIA"],




        List<List<String>> tickets = Arrays.asList(
                Arrays.asList("EZE","AXA"),
                Arrays.asList("TIA","ANU"),
                Arrays.asList("ANU","JFK"),
                Arrays.asList("JFK","ANU"),
                Arrays.asList("ANU","EZE"),
                Arrays.asList("TIA","ANU"),
                Arrays.asList("AXA","TIA"),
                Arrays.asList("TIA","JFK"),
                Arrays.asList("ANU","TIA"),
                Arrays.asList("JFK","TIA")
        );
        P332 p332 = new P332();
        List<String> result = p332.findItinerary(tickets);
        Assert.assertEquals(11, result.size());
        Assert.assertEquals("ANU",result.get(1));
    }
}
