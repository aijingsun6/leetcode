package org.alking.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            if (!validArray(board[i])) {
                return false;
            }
            char[] cs = new char[9];
            for (int j = 0; j < 9; j++) {
                cs[j] = board[j][i];
            }
            if (!validArray(cs)) {
                return false;
            }

        }
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {

                List<Character> cs = new ArrayList<>(9);
                for(int i2 = 0; i2 <3 ;i2++){

                    for( int j2 = 0; j2 < 3; j2 ++){

                        cs.add(board[i + i2][j+j2]);
                    }

                }
                if(!validList(cs)){
                    return false;
                }

            }

        }

        return true;

    }

    private boolean validArray(char[] cs) {
        List<Character> list = new ArrayList<>(cs.length);
        for (char c : cs) {
            list.add(c);
        }
        return validList(list);
    }

    private boolean validList(List<Character> cs) {
        List<Character> list = cs.stream().filter(x -> x >= '0' && x <= '9').collect(Collectors.toList());
        int size = list.size();
        long dist = list.stream().distinct().count();
        return dist == size;
    }


}
