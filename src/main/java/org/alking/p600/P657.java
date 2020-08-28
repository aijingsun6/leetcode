package org.alking.p600;

/**
 * <a href="https://leetcode-cn.com/problems/robot-return-to-origin/submissions/">link</a>
 */
public class P657 {

    private static final int[] cache = new int['U' + 1];

    public boolean judgeCircle(String moves) {
        cache['U'] = 0;
        cache['D'] = 0;
        cache['L'] = 0;
        cache['R'] = 0;

        for (char c : moves.toCharArray()) {
            cache[c] += 1;
        }
        return cache['U'] == cache['D'] && cache['L'] == cache['R'];
    }


//    public boolean judgeCircle(String moves) {
//
//        int x = 0;
//        int y = 0;
//        int dx = 0;
//        int dy = 0;
//        for (char c : moves.toCharArray()) {
//            switch (c) {
//                case 'U':
//                    dx = 0;
//                    dy = 1;
//                    break;
//                case 'D':
//                    dx = 0;
//                    dy = -1;
//                    break;
//                case 'L':
//                    dx = -1;
//                    dy = 0;
//                    break;
//                case 'R':
//                    dx = 1;
//                    dy = 0;
//                    break;
//                default:
//                    break;
//            }
//            x += dx;
//            y += dy;
//        }
//        return x == 0 && y == 0;
//
//    }
}
