package org.alking.p1800;

/**
 * https://leetcode-cn.com/problems/determine-color-of-a-chessboard-square/
 */
public class P1812 {

    public boolean squareIsWhite(String coordinates) {
        int x = coordinates.charAt(0) - 'a';
        int y = coordinates.charAt(1) - '0';
        return (x + y) % 2 == 0;
    }
}
