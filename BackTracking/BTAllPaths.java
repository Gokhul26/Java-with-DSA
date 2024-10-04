package BackTracking;

import java.util.Arrays;

public class BTAllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        allpathsPrint("", maze, 0, 0, path, 1);
    }

    static void allpaths(String p, boolean[][] maze, int r ,int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }  
        if(!maze[r][c]){
            return;
        }
        // making the visiting paths as false
        maze[r][c] = false;

        if(r < maze.length - 1){
            allpaths(p+'D', maze, r+1, c);
        }
        if(c < maze[0].length - 1){
            allpaths(p+ 'R', maze, r, c+1);
        }
        if(r>0){
            allpaths(p+'U', maze, r - 1, c);
        }
        if(c>0){
            allpaths(p+'L', maze, r, c-1);
        }

        // this is where the function will be over
        // so before the func gets removed from the stack, revert the changes that are made by that function.
        maze[r][c] = true;
    }

    static void allpathsPrint(String p, boolean[][] maze, int r ,int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));                
            }
            System.out.println(p);
            System.out.println();
            return;
        }  
        if(!maze[r][c]){
            return;
        }
        // making the visiting paths as false
        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length - 1){
            allpathsPrint(p+'D', maze, r+1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            allpathsPrint(p+ 'R', maze, r, c+1, path, step + 1);
        }
        if(r>0){
            allpathsPrint(p+'U', maze, r - 1, c, path, step + 1);
        }
        if(c>0){
            allpathsPrint(p+'L', maze, r, c-1,path, step + 1);
        }

        // this is where the function will be over
        // so before the func gets removed from the stack, revert the changes that are made by that function.
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
