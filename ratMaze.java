/* Consider a rat placed at (0, 0) in a square matrix of order N * N. It has to reach the destination at (N - 1, N - 1). Find all possible paths that the rat can take to reach from source to destination. The directions in which the rat can move are 'U'(up), 'D'(down), 'L' (left), 'R' (right). Value 0 at a cell in the matrix represents that it is blocked and rat cannot move to it while value 1 at a cell in the matrix represents that rat can be travel through it.
Note: In a path, no cell can be visited more than one time. If the source cell is 0, the rat cannot move to any other cell.

Example 1:

Input:
N = 4
m[][] = {{1, 0, 0, 0},
         {1, 1, 0, 1}, 
         {1, 1, 0, 0},
         {0, 1, 1, 1}}
Output:
DDRDRR DRDDRR
Explanation:
The rat can reach the destination at 
(3, 3) from (0, 0) by two paths - DRDDRR 
and DDRDRR, when printed in sorted order 
we get DDRDRR DRDDRR.*/

import java.util.*;
public class ratMaze {
    public static void solveMaze(ArrayList<String> ans, int r, int c, int[][] m, int n, String p, boolean[][] vis) {
        if (r == n - 1 && c == n - 1 && m[r][c] != 0) {
            ans.add(p);
            return;
        }
        if (r >= 0 && r < n && c >= 0 && c < n) {
            if (vis[r][c] == true || m[r][c] == 0) {
                return;
            }
            vis[r][c] = true;
            solveMaze(ans, r + 1, c, m, n, p + 'D', vis);// down
            solveMaze(ans, r, c - 1, m, n, p + 'L', vis);// left
            solveMaze(ans, r, c + 1, m, n, p + 'R', vis);// right
            solveMaze(ans, r - 1, c, m, n, p + 'U', vis);// up
            vis[r][c] = false;
        }
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> ans = new ArrayList<>();
        boolean vis[][] = new boolean[n][n];
        solveMaze(ans, 0, 0, m, n, "", vis);
        return ans;
    }
        public static void main(String[] args) {
        int N = 4;
        int m[][] = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 } };
            System.out.println(findPath(m,N));
    }
}
