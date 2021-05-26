package org.alking.p1600;

public class P1629 {

    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int maxTime = releaseTimes[0];
        char maxChar = keysPressed.charAt(0);
        for (int i = 1; i < keysPressed.length(); i++) {
            char c = keysPressed.charAt(i);
            int t = releaseTimes[i] - releaseTimes[i - 1];
            if (t > maxTime) {
                maxTime = t;
                maxChar = c;
            }else if(t == maxTime){
                maxChar = c > maxChar ? c: maxChar;
            }

        }
        return maxChar;
    }

}
