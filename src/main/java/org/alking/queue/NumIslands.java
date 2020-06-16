package org.alking.queue;

import java.util.*;

public class NumIslands {

    private static class Pos {
        int x;
        int y;
        Pos(int x,int y){
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pos pos = (Pos) o;
            return x == pos.x &&
                    y == pos.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }


    public int numIslands(char[][] grid) {
        if(grid == null || grid.length ==0){
            return 0;
        }

        int rowNum = grid.length;
        int colNum = grid[0].length;
        // i-j
        Set<Pos> visit = new HashSet<>();
        int acc = 0;
        for (int x = 0; x < rowNum; x++) {
            for (int y = 0; y < colNum; y++) {
                char c = grid[x][y];
                if(c == '1'){
                    Pos root = new Pos(x,y);
                    if(!visit.contains(root)){
                        visit.add(root);
                        acc += 1;
                        Deque<Pos> q = new ArrayDeque<>();
                        q.addLast(root);
                        while (!q.isEmpty()){
                            Pos r = q.getFirst();
                            int i = r.x;
                            int j = r.y;
                            // search upper
                            if(i > 0 && (grid[i-1][j] == '1')){
                                Pos p = new Pos(i-1,j);
                                if(!visit.contains(p)){
                                    visit.add(p);
                                    q.addLast(p);
                                }
                            }
                            // search down
                            if(i < rowNum-1 && grid[i+1][j] == '1'){
                                Pos p = new Pos(i+1,j);
                                if(!visit.contains(p)){
                                    visit.add(p);
                                    q.addLast(p);
                                }
                            }

                            // search left
                            if(j > 0 && grid[i][j-1] == '1'){
                                Pos p = new Pos(i,j-1);
                                if(!visit.contains(p)){
                                    visit.add(p);
                                    q.addLast(p);
                                }
                            }

                            // search right
                            if(j < colNum -1 && grid[i][j+1] == '1'){
                                Pos p = new Pos(i,j+1);
                                if(!visit.contains(p)){
                                    visit.add(p);
                                    q.addLast(p);
                                }
                            }
                            q.removeFirst();
                        }

                    }
                }

            }

        }
        return acc;
    }
}
